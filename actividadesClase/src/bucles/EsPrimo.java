package bucles;

import java.util.Scanner;

public class EsPrimo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número y te digo si es primo:");
		int miNumero = sc.nextInt();
		boolean esPrimo = true;
		
		// se pueden dar condiciones de salida compuestas dentro del for
		for(int i = 2; i < miNumero; i++) {
			System.out.print("Para i=" + i + " minumero%i = " + miNumero%i);
			
			if(miNumero%i == 0) {
				esPrimo = false;
				System.out.print(" ¿Es primo? " + esPrimo);
			}
			
			System.out.println("");
		}
		
		if(esPrimo) System.out.println("El número es primo");
		else System.out.println("El número no es primo");
		
	}

}
