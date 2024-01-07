package bucles;

import java.util.Scanner;

public class TotalAcumulado {
	
	/*
	 * Escribe un programa que vaya introduciendo una serie determinada de números mientras su suma no supere el valor de 10000.
	 * Cuando esto último ocurra, se debe mostrar el valor acumulado, el contador de los números introducidos y la media.
	 */
	
	public static void main(String[] args) {
		
		int numUser;
		int sumaNumeros = 0;
		int totalNumeros = 0;
		int contadorNumeros = 0;
		int mediaNumeros = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(sumaNumeros <= 10000) {
			
			System.out.println("Introduce un número:");
			numUser = sc.nextInt();
			sumaNumeros += numUser;
			contadorNumeros++;
		}	
		
		System.out.println("Has introducido un total de " + contadorNumeros + " números.");
		System.out.println("La suma total es " + sumaNumeros + " .");
		// La media la tengo que calcular una vez que ya he introducido el total número de elementos
		System.out.println("La media es " + sumaNumeros / contadorNumeros + " .");
		
		sc.close();
		
		/* SOLUCION PROFESOR
		do {
			numUser = sc.nextInt();
			sumaNumeros += numUser;
			contadorNumeros++;
		} while (sumaNumeros <= 10000);
		*/	
		
	}

}
