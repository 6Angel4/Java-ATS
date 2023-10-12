package operadoresaritmeticos;

public class ClaseMath {
	public static void main(String[] args) {
		/*
		 * Uso de metodos que pertenecen a la clase Math
		 */
		
		//Raiz cuadrada
		double num = Math.sqrt(9);	//aqui es 9.0
		System.out.println(num);
		//Elevacion a x potencia
		double num2 = 5, num3 = 2;
		double res = Math.pow(num2, num3);	//5^2
		//Redondear
		float num4 = 4.56f;
		int res2 = Math.round(num4);
		System.out.println(res2);
		//Random
		double numeroRandom = Math.random();
		System.out.println(numeroRandom);
	}
}
