package bucles;

import java.util.Scanner;

public class CuantosDigitos {
	//Realiza un programa que nos diga cuántos dígitos ha introducido por teclado
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Introduzca número entero y te digo los dígitos");
		long numeroIntroducido = sc.nextLong();
		
		long n = numeroIntroducido;
		int numeroDigitos = 1;
		
		// voy dividiendo cada resultado entre 10
		while (n > 10) {
			numeroDigitos++;
			n /= 10;
		}
		
		System.out.println(numeroIntroducido + " tienes " + numeroDigitos + "dígitos.");
		
		sc.close();
		
	}
	
}
