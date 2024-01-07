package funciones;

import java.util.Scanner;

public class DivisoresPrimos {
	/*
	 * Ejercicio 6
	 * Crea una función que muestre, por consola, todos los divisores primos del número que se le pasa como parámetro.
	 */
	
	public static boolean esPrimo (int num) {

		boolean esPrimo = true;
		
		//desde y mientras ocurra esto
	    for (int i = num-1; i >=2; i--) {
	      if ((num % i) == 0) {
	          esPrimo = false;
	       }
	    }     
		return esPrimo;
	}
	
	public static int divisoresPrimos(int num) {
		
		int contador = 0;
		
		for(int i = num-1; i >=2; i--) {
			
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;
				contador++;	
			}
		}
		
		System.out.println("El número tiene " + contador + " divisores primos.");
		
		return num;
	}
	
	public static void main(String[] args) {
		
		int numUser;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número y te digo sus divisores primos:");
		numUser = sc.nextInt();
		
		//System.out.println("Los divisores primos de " + numUser + " son: " + divisoresPrimos(numUser));
		
		sc.close();
	}

}
