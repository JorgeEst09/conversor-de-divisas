package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {

    public void deCelsiusAFahrenheit(double valor) {
        double resultado = redondear((valor * 1.8) + 32);
        mostrarMensaje(resultado, "Fahrenheit");
    }

    public void deCelsiusAKelvin(double valor) {
        double resultado = redondear(valor + 273.15);
        mostrarMensaje(resultado, "Kelvin");
    }

    public void deCelsiusARankine(double valor) {
        double resultado = redondear((valor * 1.8) + 491.67);
        mostrarMensaje(resultado, "Rankine");
    }

    public void deFahrenheitACelsius(double valor) {
        double resultado = redondear((valor - 32) * 0.556);
        mostrarMensaje(resultado, "Celsius");
    }

    public void deFahrenheitAKelvin(double valor) {
        double resultado = redondear((valor + 459.67) * 0.556);
        mostrarMensaje(resultado, "Kelvin");
    }

    public void deFahrenheitARankine(double valor) {
        double resultado = redondear(valor + 459.67);
        mostrarMensaje(resultado, "Rankine");
    }

    public void deKelvinACelsius(double valor) {
        double resultado = redondear(valor - 273.15);
        mostrarMensaje(resultado, "Celsius");
    }

    public void deKelvinAFahrenheit(double valor) {
        double resultado = redondear((valor - 273.15) * 1.8 + 32);
        mostrarMensaje(resultado, "Fahrenheit");
    }

    public void deKelvinARankine(double valor) {
        double resultado = redondear(valor * 1.8);
        mostrarMensaje(resultado, "Rankine");
    }

    public void deRankineACelsius(double valor) {
        double resultado = redondear((valor - 491.67) * 0.556);
        mostrarMensaje(resultado, "Celsius");
    }

    public void deRankineAFahrenheit(double valor) {
        double resultado = redondear(valor - 459.67);
        mostrarMensaje(resultado, "Fahrenheit");
    }

    public void deRankineAKelvin(double valor) {
        double resultado = redondear(valor * 0.556);
        mostrarMensaje(resultado, "Kelvin");
    }

    private double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }

    private void mostrarMensaje(double valor, String unidad) {
        JOptionPane.showMessageDialog(null, "Son " + valor + " " + unidad);
    }
}
