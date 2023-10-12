package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Una MegaPlaza se hace 20% de descuento a los compras mayoes de $300
 * Realiza el programa que te genere el total a pagar
 * Video 21
 */
public class EjercicioCondicionales4 {
	public static void main(String[] args) {
		float compraTotal = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el total de compra: "));
		float descuento, precioFinal;
		if(compraTotal>=300) {
			//Convertir el resultado en flotante
			descuento = (float) (compraTotal * 0.20);
			precioFinal = compraTotal - descuento;
			JOptionPane.showMessageDialog(null, "El total con 20% descuento por compras a partir de $300 es: " + precioFinal);
		}else {
			JOptionPane.showMessageDialog(null, "El total es: " + compraTotal);
		}
	}
}
