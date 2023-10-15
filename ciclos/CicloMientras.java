package ciclos;

import javax.swing.JOptionPane;

/*
 * imprimir del numero 1 al 100
 */
public class CicloMientras {
	public static void main(String[] args) {
		int i=0;
		while(i <= 100) {
			System.out.println(i);
			i++;
			//JOptionPane.showMessageDialog(null, i);
		}
	}
}
