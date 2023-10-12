package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Pedir una calificacion y categorizarla entre:
 * Sobresaliente,Notable, Bien, Suficiente e Insuficiente
 */

public class EjercicioCondicionales10 {
	public static void main(String[] args) {
		int cal;
		cal = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una calificacion"));
		
		switch (cal) {
		case 10:
		case 9:
			JOptionPane.showMessageDialog(null, "Sobresaliente");
			break;
		case 8:
		case 7:
			JOptionPane.showMessageDialog(null, "Notable");
			break;
		case 6:
		case 5:
			JOptionPane.showMessageDialog(null, "Bien");
			break;
		case 4:
		case 3:
			JOptionPane.showMessageDialog(null, "Suficiente");
			break;
		case 2:
		case 1:
		case 0:
			JOptionPane.showMessageDialog(null, "Insuficiente");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor no valido");
		}
	}
}
