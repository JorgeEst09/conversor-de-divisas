package Principal;

import javax.swing.JOptionPane;

// Este conversor utiliza las tasas de cambio actuales de México para las conversiones de moneda. 25/05/2024
import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;

public class Principal {

    public static void main(String[] args) {

        OpcionesConversion opcionesMonedas = new OpcionesConversion();
        OpcionesConversionTemperatura opcionesTemperatura = new OpcionesConversionTemperatura();

        while (true) {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null, "Seleccione una opción de conversión", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir");

            if (seleccion != null) {
                switch (seleccion) {
                    case "Conversor de Monedas":
                        String valorEntradaMoneda = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                        if (valorEntradaMoneda != null) {
                            try {
                                double cantidadMoneda = Double.parseDouble(valorEntradaMoneda);
                                opcionesMonedas.convertirMonedas(cantidadMoneda);

                                int continuarMoneda = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                                if (continuarMoneda != JOptionPane.OK_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                                    System.exit(0);
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número.");
                            }
                        }
                        break;

                    case "Conversor de Temperatura":
                        String valorEntradaTemperatura = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                        if (valorEntradaTemperatura != null) {
                            try {
                                double cantidadTemperatura = Double.parseDouble(valorEntradaTemperatura);
                                opcionesTemperatura.convertirTemperaturas(cantidadTemperatura);

                                int continuarTemperatura = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                                if (continuarTemperatura != JOptionPane.OK_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                                    System.exit(0);
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número.");
                            }
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                System.exit(0);
            }
        }
    }
}
