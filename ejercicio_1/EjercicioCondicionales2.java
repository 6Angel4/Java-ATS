package ejercicio_1;

import javax.swing.JOptionPane;

public class EjercicioCondicionales2 {
	public static void main(String[] args) {
		int numero1,numero2;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
		if(numero1 == numero2) {
			JOptionPane.showMessageDialog(null,"Son iguales");
		}else {
			JOptionPane.showMessageDialog(null,"Son diferentes");
		}
	}
}
