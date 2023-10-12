package ejercicio_1;

import javax.swing.JOptionPane;

public class Multiplo {
	public static void main(String[] args) {
		int datoUser;
		datoUser = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		if(datoUser%10 == 0) {
			JOptionPane.showMessageDialog(null, "El numero: "+datoUser+" es multiplo de 10");
		}else {
			JOptionPane.showMessageDialog(null, "El numero: "+datoUser+" no es multiplo de 10");
		}
	}
}
