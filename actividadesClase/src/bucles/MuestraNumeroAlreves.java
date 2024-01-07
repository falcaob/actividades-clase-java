package bucles;

import java.util.Scanner;

public class MuestraNumeroAlreves {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por teclado y luego lo muestre al revés
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		int num;
		num = sc.nextInt();
		
		String numCadena = Integer.toString(num);
		String numeroReves = "";
		
		// Invertir cadena
		
		for(int i = numCadena.length() - 1; i >= 0; i--) {
			numeroReves = numeroReves + numCadena.charAt(i);
		}
		
		System.out.println(numeroReves);

	}

}
