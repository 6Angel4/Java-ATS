package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * Pedir numeros hasta que se introduzca un negativo,
 * y mostrar cuantos numeros se han introducido
 */
public class CiclosEjercicio4 {
	public static void main(String[] args) {
		int contador=0,numero;
		JOptionPane.showMessageDialog(null, "Numeros mayores a 0");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (no menor a 0): "));
		while(numero>=0) {
			contador++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero (no menor a 0): "));
			JOptionPane.showMessageDialog(null,"Numero que se ingreso: " + numero + "\nCiclo repetido: " + contador);
		}
	}
}
