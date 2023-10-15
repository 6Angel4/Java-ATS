package ciclosEjercicios;

import java.util.Scanner;

/*
 * Leer un numero y mostrar su cuadrado,
 * repetir proceso hasta que se introduzca un numero negativo
 */
public class CiclosEjercicio1 {
	public static void main(String[] args) {
		int numero;
		double res;
		Scanner scanner = new Scanner(System.in);
		do {
			numero = scanner.nextInt();
			res = Math.pow(numero,2);
			System.out.println(res);
		}while(numero>0);
	}
}
