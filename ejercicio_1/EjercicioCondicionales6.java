package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Pedir dos numeros y saber si los dos son pares o impares
 */
public class EjercicioCondicionales6 {
	public static void main(String[] args) {
		int numero1,numero2;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero (1/2): "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero (2/2): "));
		if((numero1%2==0)&&(numero2%2==0)) {
			JOptionPane.showMessageDialog(null, numero1+" y "+numero2+" son numeros pares");
		}else if ((numero1%2!=0)&&(numero2%2==0)) {
			JOptionPane.showMessageDialog(null, "El primer numero que se ingreso no es par");
		}else if((numero2%2!=0)&&(numero1%2==0)) {
			JOptionPane.showMessageDialog(null, "El segundo numero que se ingreso no es par");
		}else {
			JOptionPane.showMessageDialog(null, "Los dos numeros que se ingresaron no son numeros pares");
		}
	}
}
