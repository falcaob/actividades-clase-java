package condicionales;

import java.util.Locale;
import java.util.Scanner;

public class ElMayor {
	
	public static void main(String[] args) {
		
		// Creación de programa que pide 2 números reales y nos dice cuál es el mayor
		
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduce dos números (enteros o decimales) y te digo cuál es el mayor:");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		if(num1 == num2) {
			System.out.println("Los números son iguales");
		} else {
			if(num1 > num2) {
				System.out.println("El número 1: " + num1 + ", es mayor que el número 2: " + num2);
			} else {
				System.out.println("El número 2: " + num2 + ", es mayor que el número 1: " + num1);
			}
		}
		
		sc.close();
		
	}
	
}
