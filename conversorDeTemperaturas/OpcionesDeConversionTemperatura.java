package conversorDeTemperaturas;

import javax.swing.JOptionPane;

public class OpcionesDeConversionTemperatura {

	ConvertirTemperaturas convertirTemp = new ConvertirTemperaturas();
	
	public void convertirTemperatura(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null, "Elije la temperatura que quieras convertir", "Temperaturas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin",
								"De Kelvin a Celsius", "De Kelvin a Fahrenheit"},"Seleccion")).toString();
		
		switch (opcion) {
		case "De Celsius a Fahrenheit":
			convertirTemp.celsiusAFahrenheit(valor);
			break;
			
		case "De Celsius a Kelvin":
			convertirTemp.celsiusAKelvin(valor);
			break;
		
		case "De Fahrenheit a Celsius":
			convertirTemp.fahrenheitACelsius(valor);
			break;
			
		case "De Fahrenheit a Kelvin":
			convertirTemp.fahrenheitAKelvin(valor);
			break;
			
		case "De Kelvin a Celsius":
			convertirTemp.kelvinACelsius(valor);
			break;
			
		case "De Kelvin a Fahrenheit":
			convertirTemp.kelvinAFahrenheit(valor);
			break;
		}
	}
}
