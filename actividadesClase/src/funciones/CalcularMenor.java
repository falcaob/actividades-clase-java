package funciones;

public class CalcularMenor {
	/*
	 * Crea una función que calcule el menor de dos número entero que recibirá como parámetros.
	 * El resultado será otro número entero.
	 */
	
	//funciones
	public static int calculoDelMenor(int num1, int num2) {
		//int menor = num1 < num2? num1 : num2;
		return num1 < num2 ? num1 : num2;
	}
	
	public static void main(String[] args) {
		
		System.out.println("El menor de los números es: " + CalcularMenor.calculoDelMenor(5, 3));
		
	}

}
