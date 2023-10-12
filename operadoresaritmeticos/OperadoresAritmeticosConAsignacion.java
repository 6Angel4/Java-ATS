package operadoresaritmeticos;
import java.util.Scanner;
public class OperadoresAritmeticosConAsignacion {
	public static void main(String[] args) {
		int numero = 10;
		//numero = numero + 5;	//Esto es correcto, pero no es lo mas optimo
		numero += 5;	//Esto es correcto, es mas corto
		System.out.println(numero);
	}
}
