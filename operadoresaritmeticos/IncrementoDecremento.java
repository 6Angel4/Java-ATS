package operadoresaritmeticos;

public class IncrementoDecremento {
	public static void main(String[] args) {
		int x = 5, y;
		/*
		 * x es igual a 5
		 * y es igual a 0
		 */
		y = ++x;	//se coloca primero (prefijo) ++, para que primero se le sume 1 al valor de x (5)	
		System.out.println(y);	//no es igual a 6 (x++), porque primero obtiene el valor (5) y despues le suma 1 
		System.out.println(x);
	}
}
