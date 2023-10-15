package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * Pedir 10 numeros y sumarlos 10 para dar un total (usando for)
 */
public class CiclosEjercicio10 {
	public static void main(String[] args) {
		int numero,total=0;

		for(int limite=1;limite<=10;limite++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero: "));
			total += numero;
			System.out.println("limite: "+limite+" - Numero: - "+numero+" - Total: - "+total);
		}
	}
}
