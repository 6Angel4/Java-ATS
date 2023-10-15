package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * Pedir numeros hasta que se introduzca un negativo
 * y calcular la media
 */
public class CiclosEjercicio7 {
	public static void main(String[] args) {
		int numero,elementos=0,suma=0;
		float media;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte numero: "));
		
		while(numero>=0) {
			suma += numero;
			elementos++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte numero: "));
		}
		if(elementos==0) {
			System.out.println("Error!");
		}else {
			media = suma/elementos;
			JOptionPane.showMessageDialog(null, "Media: "+media);
		}
	}
}
