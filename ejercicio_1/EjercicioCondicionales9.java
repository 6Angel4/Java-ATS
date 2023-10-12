package ejercicio_1;

import javax.swing.JOptionPane;

public class EjercicioCondicionales9 {
	public static void main(String[] args) {
		int numero1, numero2;
		char operacion;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));
		
		operacion = JOptionPane.showInputDialog("Operacion a realizar").charAt(0);
		
		//Condicional switch con opcion multiple
		switch(operacion) {
		case 's':
		case 'S':
			JOptionPane.showMessageDialog(null, numero1+numero2);
			break;
		case 'r':
		case 'R':
			JOptionPane.showMessageDialog(null, numero1-numero2);
			break;
		case 'm':
		case 'M':
			JOptionPane.showMessageDialog(null, numero1*numero2);
			break;
		case 'd':
		case 'D':
			JOptionPane.showMessageDialog(null, numero1/numero2);
			break;
		case 'p':
		case 'P':
			JOptionPane.showMessageDialog(null, numero1%numero2);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion no valida");
		}
	}
}
