package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemperatura {

    private final ConvertirTemperaturas conversor = new ConvertirTemperaturas();

    public void convertirTemperaturas(double valor) {
        String[] opciones = {
                "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine",
                "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
                "De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine",
                "De Rankine a Celsius", "De Rankine a Fahrenheit", "De Rankine a Kelvin"
        };

        String seleccion = (String) JOptionPane.showInputDialog(
                null, "Elige la conversión de temperatura deseada",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]
        );

        if (seleccion != null) {
            switch (seleccion) {
                case "De Celsius a Fahrenheit":
                    conversor.deCelsiusAFahrenheit(valor);
                    break;
                case "De Celsius a Kelvin":
                    conversor.deCelsiusAKelvin(valor);
                    break;
                case "De Celsius a Rankine":
                    conversor.deCelsiusARankine(valor);
                    break;
                case "De Fahrenheit a Celsius":
                    conversor.deFahrenheitACelsius(valor);
                    break;
                case "De Fahrenheit a Kelvin":
                    conversor.deFahrenheitAKelvin(valor);
                    break;
                case "De Fahrenheit a Rankine":
                    conversor.deFahrenheitARankine(valor);
                    break;
                case "De Kelvin a Celsius":
                    conversor.deKelvinACelsius(valor);
                    break;
                case "De Kelvin a Fahrenheit":
                    conversor.deKelvinAFahrenheit(valor);
                    break;
                case "De Kelvin a Rankine":
                    conversor.deKelvinARankine(valor);
                    break;
                case "De Rankine a Celsius":
                    conversor.deRankineACelsius(valor);
                    break;
                case "De Rankine a Fahrenheit":
                    conversor.deRankineAFahrenheit(valor);
                    break;
                case "De Rankine a Kelvin":
                    conversor.deRankineAKelvin(valor);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        }
    }
}
