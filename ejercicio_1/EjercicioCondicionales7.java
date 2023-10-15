package ejercicio_1;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

/*
 * numero entre 0 y 99999 y saber cuantos digitos tiene el numero colocado
 */
public class EjercicioCondicionales7 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
		if(numero>0 || numero<=99999) {
			//realmente esto es inecesario (la conversion)
			String numeroConvertido = Integer.toString (numero); //Convertir de entero a String
			JOptionPane.showMessageDialog(null, numeroConvertido.length());
		}else {
			JOptionPane.showMessageDialog(null, "Cantidad no valida");
		}
	}
}
