package condicionales;

import java.util.Scanner;

public class EscribeNumero {
	
	public static void main(String[] args) {
		
		//Crea un programa que escriba como texto cualquier número del 1 al 10 que el usuario introduzca
		
		int numUser;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		numUser = sc.nextInt();
		
		// if(numUser > 0 && numUser >= 10) {}, en caso de no poner default
		
		switch (numUser) {
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("Cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println("Siete");
				break;
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;
			case 10:
				System.out.println("Diez");
				break;
			default:
				System.out.println("Número incorrecto");
		}
		
		System.out.println("Programa terminado");
		
		sc.close();
	}

}
