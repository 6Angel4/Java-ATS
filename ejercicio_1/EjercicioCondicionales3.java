package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Hacer un programa que  lea un caracter por teclado y compruebe si es una letra mayuscula
 */
public class EjercicioCondicionales3 {
	public static void main(String[] args) {
		char letra;
		//metodo charAt(0) para pedir solo el primer caracter [0]
		letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
		
		if(Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
		}else {
			JOptionPane.showMessageDialog(null, "Es una letra minuscula");
		}
	}
}
