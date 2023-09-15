package principal;

import javax.swing.JOptionPane;

import conversorDeMonedas.OpcionesDeConversionMonedas;
import conversorDeTemperaturas.OpcionesDeConversionTemperatura;

public class Principal {

	public static void main(String[] args) {
		
		OpcionesDeConversionMonedas opcionesDeConversionMonedas = new OpcionesDeConversionMonedas();
		OpcionesDeConversionTemperatura opcionesDeConversionTemperatura = new OpcionesDeConversionTemperatura();
		
		
		try {
			EXTERNA:
			while(true) {
				String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
				
				switch(opciones) {
				case "Conversor de Monedas":
					String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
					if(validarNumero(input)) {
						double inputDouble = Double.parseDouble(input);
						opcionesDeConversionMonedas.convertir(inputDouble);
					} else {
						JOptionPane.showMessageDialog(null, "Valor no válido, por favor ingrese un valor de tipo numérico");
						break;
					}
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == respuesta) {
						break;
					}else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						break EXTERNA;
					}
					
					
				case "Conversor de Temperatura":
					String inputT = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					if(validarNumero(inputT)) {
						double inputTDouble = Double.parseDouble(inputT);
						opcionesDeConversionTemperatura.convertirTemperatura(inputTDouble);
					}else {
						JOptionPane.showMessageDialog(null, "Valor no válido, por favor ingrese un valor de tipo numérico");
						break;
					}
					int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == respuestaT) {
						break;
					}else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						break EXTERNA;
					}
				}
			}
		}catch(NullPointerException npe) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
	}
	
	//Validación de valores numéricos:
	public static boolean validarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0);
				return true;
			
			} catch(NumberFormatException e) {
			return false;
			}
	}
}
