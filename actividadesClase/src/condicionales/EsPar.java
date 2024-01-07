package condicionales;

import java.util.Scanner;

public class EsPar {

	public static void main(String[] args) {

		// Programa que pide numero entero y da una variable booleana llamanda esPar e imprime su valor
		
		int numUser;
		boolean esPar = false;
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Introduce un número:");
		numUser = sr.nextInt();
		
		if(numUser%2 == 0) {
			System.out.println("El número es par");
			esPar = true;
			System.out.println("El valor de esPar es: " + esPar);
		}
		
		System.out.println("El número es impar");
		System.out.println("El valor de esPar es: " + esPar);
		
		
		sr.close();
	}

}
