package principal;

import javax.swing.JOptionPane;

import conversorDeMonedas.OpcionesDeConversionMonedas;

public class Principal {

	public static void main(String[] args) {
		
		OpcionesDeConversionMonedas opcionesDeConversionMonedas = new OpcionesDeConversionMonedas();
		
		String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
		
		switch(opciones) {
		case "Conversor de Monedas":
			String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
			double inputDouble = Double.parseDouble(input);
			opcionesDeConversionMonedas.convertir(inputDouble);
		
		}
		
	}
}
