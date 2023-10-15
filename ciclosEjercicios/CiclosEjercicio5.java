package ciclosEjercicios;

import javax.swing.JOptionPane;

/*
 * Juego para adivinar un numero aleatorio entre 0 y 100
 * y mostrar el numero de intentos
 */
public class CiclosEjercicio5 {
	public static void main(String[] args) {
		int intentos=0, numero, random;
		
		/*
		 * Gnerar el numero aleatorio
		 * Se coloca afuera porque si se mete al ciclo este cambiara
		 */
		random = (int) (Math.random()*100); //Interpretarlo a entero
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
			if(random>numero) {
				 JOptionPane.showMessageDialog(null, "Ingresa un numero mayor");
			}else {
				JOptionPane.showMessageDialog(null, "Ingresa un numero menor");
			}
			//aumento en 1 el numero de intentos por cada ciclo
			intentos++;
			//JOptionPane.showMessageDialog(null, random);
		}while(numero!=random);
		JOptionPane.showMessageDialog(null, "Correcto\n"+"El numero era: "+random+"\nNumero de intentos: "+intentos);
	}
}
