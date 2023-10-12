package operadoresaritmeticos;
import java.util.Scanner;
public class OperadoresAritmeticos {
	public static void main(String[] args) {
		/*
		 * Operadores Aritmeticos basicos:
		 * Suma, Resta, Multiplicacion, Division, Modulo (residuo)
		 */
		Scanner scanner = new Scanner(System.in);
		float numero1, numero2, suma, resta, mul, div, mod;
		
		System.out.println("Digitar los DOS numeros (estos pueden tener punto decimal): ");
		numero1 = scanner.nextFloat();
		numero2 = scanner.nextFloat();
		
		//Operaciones
		
		//Suma
		suma = numero1 + numero2;
		//Resta
		resta = numero1 - numero2;
		//Multiplicaion
		mul = numero1 * numero2;
		//Division
		div = numero1 / numero2;
		//Modular
		mod = numero1 % numero2;
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		
	}
}
