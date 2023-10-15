package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * Leer numeros hasta que se introduzca un 0.
 * Para cada uno indicar si es par o impar
 */
public class CiclosEjercicio3 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero (diferente a 0): "));
		while(numero !=0) {
			if(numero%2==0) {
				JOptionPane.showMessageDialog(null, numero + " es par");
			}else {
				JOptionPane.showMessageDialog(null, numero + " es impar");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero (diferente a 0): "));
		}
	}
}
