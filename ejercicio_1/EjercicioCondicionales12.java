package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Hacer un programa que pase de Kg a otra unidad de medida de peso,
 * mostrar pantalla con menu de opciones
 */
public class EjercicioCondicionales12 {
	public static void main(String[] args) {
		//Pedir los Kg
		float cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kg a convertir: "));
		int opcionesConversion;
		//Menu - GUI
		opcionesConversion = Integer.parseInt(JOptionPane.showInputDialog("Opciones de conversion\n"+
				"1 Gramos (g)\n"+"2 Miligramo (mg)\n"+"3 Microgramo (µg)"));
		//Menu - switch
		switch(opcionesConversion) {
		case 1:
			cantidad*=1000;
			JOptionPane.showMessageDialog(null, cantidad+"g");
			break;
		case 2:
			cantidad*=1000000;
			JOptionPane.showMessageDialog(null, cantidad+"mg");
			break;
		case 3:
			cantidad*=1000000000;
			JOptionPane.showMessageDialog(null, cantidad+"µg");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion no valida");
			break;
		}
		
	}
}
