package condicionales;

import java.util.Scanner;

public class CuantosPositivos {
	
	public static void main(String[] args) {
		
		//Pide 2 números enteros y diga si son positivos al menos uno de ellos o ninguno
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número entero:");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número entero:");
		num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("Los números son postivos");
		
		// Otra solución: (n1>0 || n2>0) syso "" + (n1 > 0 ? ni:n2), consideramos que el 0 no es positivo
		} else if (num1 > 0){
			System.out.println("El primer número es positivo");
		} else if(num2 > 0) {
			System.out.println("El segundo número es positivo");
		} else {
			System.out.println("Ninguno de los números son positivos");
		}
		
		sc.close();
	}
}
