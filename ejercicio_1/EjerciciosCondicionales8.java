package ejercicio_1;

import javax.swing.JOptionPane;

/*
 * Pedir el dia, mes y año de una fecha e indicar si la
 * fecha es correcta (con meses de 28,30 y 31 dias).
 * Sin años biciestos
 */
public class EjerciciosCondicionales8 {
	public static void main(String[] args) {
		int dia,mes,año;
		String fecha,fechaDia,fechaMes,fechaAño;
		JOptionPane.showMessageDialog(null, "Ingresa dia, mes y año (numeros)");
		
		//Datos a pedir
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un mes: "));
		año = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un año: "));
		
		//Convertir los datos a String
		fechaDia = Integer.toString(dia);
		fechaMes = Integer.toString(mes);
		fechaAño = Integer.toString(año);
		
		//Pruebas
		if((dia>=1&&dia<=31)&&(mes>=1&&mes<=12)&&año>=1) {
			fecha = fechaDia+"/"+fechaMes+"/"+fechaAño;
			JOptionPane.showMessageDialog(null, fecha);
		}else {
			JOptionPane.showMessageDialog(null, "Fecha no valida");
		}
	}
}
