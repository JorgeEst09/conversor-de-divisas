package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateAPI {
    private static final String API_KEY = "46d1259eadf1d298f26dc491";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obtenerTasaCambio(String base, String objetivo) {
        String urlString = BASE_URL + API_KEY + "/latest/" + base;
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder inline = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    inline.append(line);
                }

                String[] parts = inline.toString().split("\"" + objetivo + "\":");
                String[] parts2 = parts[1].split(",");
                return Double.parseDouble(parts2[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return 0.0;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
