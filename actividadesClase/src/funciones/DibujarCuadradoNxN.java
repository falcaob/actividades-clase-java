package funciones;

import java.util.Scanner;

public class DibujarCuadradoNxN {
	/*
	 * Crea una función llamada "dibujarCuadradoNxN", que dibuje un cuadrado formado por n filas con n asteriscos
	 * cada una. Crea también un "main" para comprobar que funciona correctamente. Desde main se preguntará al usuario
	 * cuánto vale el parámetro n. Nombre de la clase: "DibujarCuadrado.java".
	 */
	
	//funciones
	public static void dibujarCuadradoNxN (int n) {
		
		int i, j;
		
		for(i=1; i<=n; i++) {
			
			for(j=1; j<=n; j++) {
				System.out.print(" * ");
			}	
		
			System.out.println("");
		} 	
	}
	
	
	public static void main(String[] args) {
		
		int lado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		lado = sc.nextInt();
	
		DibujarCuadradoNxN.dibujarCuadradoNxN(lado);
		
	}
	
}
