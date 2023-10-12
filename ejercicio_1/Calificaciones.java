package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Hacer uso de JOption
 */
public class Calificaciones {
	public static void main(String[] args) {
		//Pedir que se ingrese la primer calificacion (JOptionPane), convertir de String a Float
		float cal1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la primer calificacion: "));
		float cal2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la segunda calificacion: "));
		float cal3 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la tercer calificacion: "));
		float resultado = (cal1 + cal2 + cal3) / 3;
		JOptionPane.showMessageDialog(null, "El promedio general es: "+resultado);
		/*
		 * Uso de float para evitar consumo de memoria inecesaria
		 * Uso de JOptionPane para pedir los datos de manera mas entendible para el usuario
		 * Uso de JOptionPane para mostrar el resultado mas entendible para el usuario
		 */
	}
}
