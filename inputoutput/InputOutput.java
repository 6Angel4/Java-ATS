package inputoutput;
import java.util.Scanner;
public class InputOutput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;	//se usara despues
		double numero2;
		float numero3;
		String cadena;
		String cadena2;
		char letra;
		System.out.println("Digite un numero (primero sin decimales): ");
		numero = scanner.nextInt();
		numero2 = scanner.nextDouble();
		numero3 = scanner.nextFloat();
		cadena = scanner.next();	//Solo guarda hasta donde encuentre un espacio, es decir, guarda todo lo que este antes de encontrar un espacio
		cadena2 = scanner.nextLine();	//Guarda la cadena completa (sin importar caracteres, espacios, etc)
		letra = scanner.next().charAt(0);	//Indica charAt(0) que solo almacena el primer caracter que encuentre
		/*
		 * OPCIONAL (en caso de que se presente un error a futuro)
		 * Para almacenar un double o float, se requiere que cuando se ingrese el numero, el usuario cambie el "." por ","
		 * 
		 */
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(cadena);
	}
}
