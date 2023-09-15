package conversorDeMonedas;

import javax.swing.JOptionPane;

public class OpcionesDeConversionMonedas {
	
	ConvertirMonedas convertirMonedas = new ConvertirMonedas();

	public void convertir(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda que quieras convertir", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Soles a Dolares", "De Soles a Euros", "De Soles a Libras", "De Soles a Yenes", "De Soles a Wones Coreanos", "De Dolares a Soles",
								"De Euros a Soles", "De Libras a Soles", "De Yenes a Soles", "De Wones Coreanos a Soles"},"Seleccion")).toString();
		
		switch (opcion) {
		case "De Soles a Dolares":
			convertirMonedas.solesADolares(valor);
			break;
			
		case "De Soles a Euros":
			convertirMonedas.solesAEuros(valor);
			break;
		
		case "De Soles a Libras":
			convertirMonedas.solesALibras(valor);
			break;
		
		case "De Soles a Yenes":
			convertirMonedas.solesAYenes(valor);
			break;
			
		case "De Soles a Wones Coreanos":
			convertirMonedas.solesAWonesCoreanos(valor);
			break;
			
		case "De Dolares a Soles":
			convertirMonedas.dolaresASoles(valor);
			break;
			
		case "De Euros a Soles":
			convertirMonedas.eurosASoles(valor);
			break;
			
		case "De Libras a Soles":
			convertirMonedas.librasASoles(valor);
			break;
			
		case "De Yenes a Soles":
			convertirMonedas.yenesASoles(valor);
			break;
		
		case "De Wones Coreanos a Soles":
			convertirMonedas.wonesKoreanosASoles(valor);
			break;
		
		}
		
	}

}
