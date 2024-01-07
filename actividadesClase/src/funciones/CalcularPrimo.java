package funciones;

import java.util.Scanner;

public class CalcularPrimo {
	/*
	 * Crea una función "esPrimo", que reciba un número y devuelva el valor booleano "true" si es un número primo
	 * o "false" en caso contrario. Prueba dicha función desde main.
	 * 
	 * (mirar actividad de los bucles EsPrimo.java) para que no haga todas las divisiones
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
	
	public static void main(String[] args) {
		
		int numUser;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número y te digo si es primo:");
		numUser = sc.nextInt();
		
		//System.out.println("El número es primo = " + CalcularPrimo.esPrimo(numUser));
		
		if(esPrimo(numUser)) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número NO es primo");
		}
		
		sc.close();
		
	}

}
