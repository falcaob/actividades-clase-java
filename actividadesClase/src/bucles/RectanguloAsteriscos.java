package bucles;

import java.util.Scanner;

public class RectanguloAsteriscos {

	public static void main(String[] args) {
		//Crea un programa que pida dos numeros tipo byte al usuario y escriba en pantalla un rectangulo formando astericos
		//que tendrá como alto el primero numero y como ancho el segundo numero.
		
		byte alto, ancho;
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas:");
		alto = sc.nextByte();
		
		System.out.println("Introduce el número de columnas:");
		ancho = sc.nextByte();
		
		for(i=1; i<=alto; i++) {
			
			for(j=1; j<=ancho; j++) {
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
	}

}
