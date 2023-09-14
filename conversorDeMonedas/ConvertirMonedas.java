package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

		// Tasas de conversion:
		private double unDolarASoles = 3.68;
		private double unEuroASoles = 3.96;
		private double unaLibraASoles = 4.60;
		private double unYenASoles = 0.025;
		private double unWonASoles = 0.0028;
		
		public void solesADolares(double valor) {
			double resultado = valor / unDolarASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Dolares");
		}
		
		public void solesAEuros(double valor) {
			double resultado = valor / unEuroASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Euros");
		}
		
		public void solesALibras(double valor) {
			double resultado = valor / unaLibraASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Libras");
		}
		
		public void solesAYenes(double valor) {
			double resultado = valor / unYenASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Yenes");
		}
		
		public void solesAWonesCoreanos(double valor) {
			double resultado = valor / unWonASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Wones");
		}
		
		public void dolaresASoles(double valor) {
			double resultado = valor * unDolarASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Soles");
		}
		
		public void eurosASoles(double valor) {
			double resultado = valor * unEuroASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Soles");
		}
		
		public void librasASoles(double valor) {
			double resultado = valor * unaLibraASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Soles");
		}
		
		public void yenesASoles(double valor) {
			double resultado = valor * unYenASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Soles");
		}
		
		public void wonesKoreanosASoles(double valor) {
			double resultado = valor * unWonASoles;
			resultado = (double)Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes " + resultado + " Soles");
		}
		
}
