package ConversorMonedas;

import javax.swing.JOptionPane;
import api.ExchangeRateAPI;

public class ConvertirMonedas {

    ExchangeRateAPI api = new ExchangeRateAPI();

    public void ConvertirPesosMexicanosDolares(double valor) {
        double tasa = api.obtenerTasaCambio("MXN", "USD");
        double monedaDolar = valor * tasa;
        monedaDolar = (double)Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dólares");
    }

    public void ConvertirPesosMexicanosEuros(double valor) {
        double tasa = api.obtenerTasaCambio("MXN", "EUR");
        double monedaEuro = valor * tasa;
        monedaEuro = (double)Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }

    public void ConvertirPesosMexicanosLibras(double valor) {
        double tasa = api.obtenerTasaCambio("MXN", "GBP");
        double monedaLibra = valor * tasa;
        monedaLibra = (double)Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
    }

    public void ConvertirPesosMexicanosYenes(double valor) {
        double tasa = api.obtenerTasaCambio("MXN", "JPY");
        double monedaYen = valor * tasa;
        monedaYen = (double)Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes Japoneses");
    }

    public void ConvertirPesosMexicanosWonSurcoreano(double valor) {
        double tasa = api.obtenerTasaCambio("MXN", "KRW");
        double monedaWon = valor * tasa;
        monedaWon = (double)Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won Surcoreano");
    }

    public void ConvertirDolaresPesosMexicanos(double valor) {
        double tasa = api.obtenerTasaCambio("USD", "MXN");
        double monedaPeso = valor * tasa;
        monedaPeso = (double)Math.round(monedaPeso * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos Mexicanos");
    }

    public void ConvertirEurosPesosMexicanos(double valor) {
        double tasa = api.obtenerTasaCambio("EUR", "MXN");
        double monedaPeso = valor * tasa;
        monedaPeso = (double)Math.round(monedaPeso * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos Mexicanos");
    }

    public void ConvertirLibrasPesosMexicanos(double valor) {
        double tasa = api.obtenerTasaCambio("GBP", "MXN");
        double monedaPeso = valor * tasa;
        monedaPeso = (double)Math.round(monedaPeso * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos Mexicanos");
    }

    public void ConvertirYenesPesosMexicanos(double valor) {
        double tasa = api.obtenerTasaCambio("JPY", "MXN");
        double monedaPeso = valor * tasa;
        monedaPeso = (double)Math.round(monedaPeso * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos Mexicanos");
    }

    public void ConvertirWonSurcoreanoPesosMexicanos(double valor) {
        double tasa = api.obtenerTasaCambio("KRW", "MXN");
        double monedaPeso = valor * tasa;
        monedaPeso = (double)Math.round(monedaPeso * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos Mexicanos");
    }
}
