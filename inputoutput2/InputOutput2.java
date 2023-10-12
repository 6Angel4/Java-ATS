package inputoutput2;

import javax.swing.JOptionPane;

public class InputOutput2 {
	public static void main(String[] args) {
		/*
		 * Realizar la entrada y salida de datos de manera mas grafica
		 * Esto se logra con JOptionPane.showInputDialog("Texto aqui");
		 */
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));	//Convertir de String a Int
		letra = JOptionPane.showInputDialog("Ingresa un caracter: ").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero decimal: "));
		
		//Mostrar los datos
		JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
		JOptionPane.showMessageDialog(null, "El entero es: "+entero);
		JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
		JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
	}
}
