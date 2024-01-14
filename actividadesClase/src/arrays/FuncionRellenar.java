package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FuncionRellenar {
	
	/*
	 * Construye una función que haga lo mismo que el método .fill.
	 * static void rellenar (int t[], int valor)
	 * Lo que va a hacer es rellenar el Array de entero t[] con el número "valor".
	 */
	
	public static void rellenar (int t[], int valor) {
		
		for(int i=0; i<=t.length-1; i++) {
			// Relleno con la variable valor
			t[i] = valor;
		}
		
	}
	
	public static void mostrarArray (int t[]) {
		for(int i=0; i<=t.length-1; i++) {
			System.out.print(t[i]+ "\t");
		}
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		int notas[] = new int [10];
		int edades[] = new int [10];
		
		System.out.println("El Array antes de rellenarlo:");
		mostrarArray(notas);
		
		rellenar(notas, 5);
		
		System.out.println("El Array después de rellenarlo:");
		mostrarArray(notas);
		
		Arrays.fill(edades, 45);
		mostrarArray(edades);
		
		// PUEDE SER PREGUNTA DE EXAMEN
		// Desde 2 hasta 7-1
		Arrays.fill(edades, 2, 7, 20);
		mostrarArray(edades);
		
	}
	
	

}
