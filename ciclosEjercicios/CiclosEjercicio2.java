package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * Leer un numero e indicar si es positivo o negativo
 * El proceso se repite hasta que se introduzca un 0
 */
public class CiclosEjercicio2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Numero Positivo + o Negativo -");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
		while(numero!=0) {
			if(numero>0) {
				JOptionPane.showMessageDialog(null, numero + " Postivo");
			}else {
				JOptionPane.showMessageDialog(null, numero + " Negativo");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
		}
	}
}
