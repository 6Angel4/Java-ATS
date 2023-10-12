package condicionales;

import javax.swing.JOptionPane;
/*
 * == igualdad
 * != diferencias
 * < menor que
 * > mayor que
 */
public class Condicionalesifelse {
	public static void main(String[] args) {
		int numero, dato=5;
		//*Integer.parseInt para que el dato se lea como un entero
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		if(numero == dato) {
			JOptionPane.showMessageDialog(null, "Son iguales");
		}else {
			JOptionPane.showMessageDialog(null, "Son diferentes");
		}
	}
}
