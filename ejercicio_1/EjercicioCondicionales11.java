package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Simular un cajero automatico con un saldo inicial de $1000
 * con el siguiente menu de opciones
 * 
 * 1	Ingresar dinero
 * 2	Retiro de dinero
 * 3	Salir
 */

public class EjercicioCondicionales11 {
	public static void main(String[] args) {
		final int SALDOINICIAL = 1000;	//Constante (final)
		int opcionMenu;
		float monto, saldoActual;
		
		JOptionPane.showMessageDialog(null, "Banco ATS\n"+"1.- Ingresar saldo\n"+
		"2.- Retirar saldo\n"+"3.- Salir\n");
		
		
		//Ingrese opcion
		opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una operacion: "));
		
		switch (opcionMenu) {
		case 1:
			JOptionPane.showMessageDialog(null, "Ingresar Saldo");
			monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un monto: "));
			saldoActual = SALDOINICIAL+monto;
			JOptionPane.showMessageDialog(null,saldoActual);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Retirar Saldo");
			monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un monto: "));
			saldoActual = SALDOINICIAL-monto;
			JOptionPane.showMessageDialog(null, saldoActual);
		case 3:
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion no valida");
		}
	}
}
