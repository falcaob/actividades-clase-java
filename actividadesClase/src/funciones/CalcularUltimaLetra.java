package funciones;

import java.util.Scanner;

public class CalcularUltimaLetra {
	/*
	 * Crea una función que devuelva la última letra de una cadena de texto.
	 * Probar esta función para calcular la última letrade la frase "Hola".
	 */
	
	public static char ultimoCaracter (String cadena) {
		
		return cadena.charAt(cadena.length()-1);
	}
	
	public static void main(String[] args) {
		
		String textUser;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena:");
		textUser = sc.nextLine(); //consume el Intro
		
		System.out.println("La última letra es: " + CalcularUltimaLetra.ultimoCaracter(textUser));
		
		sc.close();
		
	}
	

}
