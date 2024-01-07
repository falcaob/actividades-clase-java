package condicionales;

import java.util.Scanner;

public class ElMenor {
	
	public static void main(String[] args) {
		
		// Programa que pide 2 numeros de tipo byte y crea una variable, llamada "menor". Que tenga el valor del menor
		// de esos dos números. Hacerlo sin usar "if"
		
		byte num1;
		byte num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números:");
		num1 = sc.nextByte();
		num2 = sc.nextByte();
		
		// condicion ? valor si verdadero : varlor si falso
		byte menor =  num1 < num2? num1 : num2;
		System.out.println("El menor de los número es: " + menor);
			
		sc.close();
	}

}
