package conversorDeTemperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
	
	public void celsiusAFahrenheit(double celsius) {
		double fahrenheit = (celsius*9/5)+32;
		JOptionPane.showMessageDialog(null, "Son " + fahrenheit + " grados Fahrenheit");
	}

	public void celsiusAKelvin(double celsius) {
		double Kelvin = celsius + 273.15;
		JOptionPane.showMessageDialog(null, "Son " + Kelvin + " grados Kelvin");
	}

	public void fahrenheitACelsius(double fahrenheit) {
		double Celsius = (fahrenheit - 32) * 5/9;
		Celsius = (double)Math.round(Celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + Celsius + " grados Celsius");
	}

	public void fahrenheitAKelvin(double fahrenheit) {
		double Kelvin = (fahrenheit - 32) * 5/9 + 273.15;
		Kelvin = (double)Math.round(Kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + Kelvin + " grados Kelvin");
	}

	public void kelvinACelsius(double kelvin) {
		double Celsius = kelvin - 273.15;
		JOptionPane.showMessageDialog(null, "Son " + Celsius + " grados Celsius");
	}

	public void kelvinAFahrenheit(double Kelvin) {
		double Fahrenheit = (Kelvin - 273.15) * 9/5 + 32;
		JOptionPane.showMessageDialog(null, "Son " + Fahrenheit + " grados Fahrenheit");
	}
}
