package ejercicio_1;

import javax.swing.JOptionPane;

public class EjercicioCondicionales5 {
	public static void main(String[] args) {
		int horasTrabajo;
		float salarioTotal;
		
		//Pedir las horas
		horasTrabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
		
		if(horasTrabajo<=40) {
			salarioTotal = horasTrabajo*16;
		}else {
			salarioTotal = (40*16) + ((horasTrabajo-40)*20);
		}
		JOptionPane.showMessageDialog(null,"SalarioTotal: "+salarioTotal);
	}
}
