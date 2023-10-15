package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * Pedir numeros hasta que se ingrese un 0,
 * mostrar la suma de todos los numeros que se ingresan
 */
public class CiclosEjercicio6 {
	public static void main(String[] args) {
		int numero,total=0;

		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero (diferente de 0):"));
			total = total+numero;
			JOptionPane.showMessageDialog(null, "tu numero: "+numero+"\ntotal: "+total);
		}while(numero!=0);
	}
}
