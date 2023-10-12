package tiposdedato;

public class TiposDeDatos {
	public static void main(String[] args) {
		//Valores numericos
		byte v_byte = 127;
		short v_short = 32767;
		int v_int = 2147483647;
		System.out.println(v_byte+" "+v_short+" "+v_int);
		//Valores decimales
		float pi_1 = 3.1415f;	//siempre se debe colocar la "f" al final del valor
		double pi_2 = 3.1415;	//no requiere la f o algun dato mas, pero este tiene mayor peso que una variable float
		System.out.println(pi_1+" "+pi_2);
		//Caracteres ('h'|'o'|'l'|'a')
		char caracter = 'a';
		System.out.println(caracter);
		//Booleanos (verdadero|falso[1|0])
		boolean decision = true;	//verdadero o falso
	}
}
