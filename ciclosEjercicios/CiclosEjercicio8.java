package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * pedir N numero, y mostrar todos los numeros del 1 al N
 */
public class CiclosEjercicio8 {
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte numero: "));
		for(int inicio=1;inicio<=numero;inicio++) {
			System.out.println(inicio +" - "+ numero);
		}
	}
}
