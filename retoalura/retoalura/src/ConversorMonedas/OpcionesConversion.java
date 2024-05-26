package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

    ConvertirMonedas monedas = new ConvertirMonedas();

    public void convertirMonedas(double valor) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda que deseas convertir tu dinero ",  "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos"},
                "Seleccion")).toString();

        switch (opcion) {
            case "De Pesos a Dólar":
                monedas.ConvertirPesosMexicanosDolares(valor);
                break;

            case "De Pesos a Euro":
                monedas.ConvertirPesosMexicanosEuros(valor);
                break;

            case "De Pesos a Libras Esterlinas":
                monedas.ConvertirPesosMexicanosLibras(valor);
                break;

            case "De Pesos a Yenes":
                monedas.ConvertirPesosMexicanosYenes(valor);
                break;
            
            case "De Pesos a Won Surcoreano":
                monedas.ConvertirPesosMexicanosWonSurcoreano(valor);
                break;

            case "De Dólar a Pesos":
                monedas.ConvertirDolaresPesosMexicanos(valor);
                break;

            case "De Euro a Pesos":
                monedas.ConvertirEurosPesosMexicanos(valor);
                break;

            case "De Libras Esterlinas a Pesos":
                monedas.ConvertirLibrasPesosMexicanos(valor);
                break;

            case "De Yenes a Pesos":
                monedas.ConvertirYenesPesosMexicanos(valor);
                break;

            case "De Won Surcoreano a Pesos":
                monedas.ConvertirWonSurcoreanoPesosMexicanos(valor);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }
}
