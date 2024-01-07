package funciones;

public class SonAmigos {

	/*
	 * Ejercicio 7.
	 * 
	 * Escribe una función que decida si dos números enteros positivos son amigos.
	 * Dos números a y b son amigos si la suma de los divisores propios (distintos
	 * de él mismo) de a es igual a b. Y viceversa.
	 * 
	 * Para probar se pueden usar los números 220 y 284, que son amigos.
	 */

	public static void main(String[] args) {
		int numero1 = 220;
		int numero2 = 284;

		if (sonAmigos(numero1, numero2)) {
			System.out.println(numero1 + " y " + numero2 + " son números amigos.");
		} else {
			System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
		}
	}

	public static boolean sonAmigos(int num1, int num2) {
		return (sumaDivisoresPropios(num1) == num2) && (sumaDivisoresPropios(num2) == num1);
	}

	public static int sumaDivisoresPropios(int num) {
		int suma = 1; // Iniciamos con 1 porque todo número es divisible por 1

		for (int i = 2; i <= Math.sqrt(num); i++) {
			// No es necesario verificar divisores más grandes que la raíz cuadrada
			// para obtener todos los divisores propios
			if (num % i == 0) {
				suma += i;
				if (i != num / i) {
					suma += num / i;
				}
			}
		}

		return suma;
	}

}
