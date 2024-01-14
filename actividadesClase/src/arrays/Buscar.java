package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Buscar {
	
	/*
	 * BUSCAR EN ARRAY NO ORDENADO (Ejemplo 8)
	 */
	
	// Buscame en este array esto = clave
	static int buscar(int t[], int clave) {
		int posicion;
		int i = 0;
		
		// Mientras el indice no haya llegado al final y el contenido sea distinto de la calve
		// ve moviendote
		while (i < t.length && t[i] != clave) {
			i++;
		}
		
		// Si encuentra el elemento en el array sino devuelve -1
		if(i < t.length) {
			posicion = i;
		} else {
			posicion = -1;
		}
		
		return posicion;
	}
	
	public static void main(String[] args) {
		 int aux[] = {23, 45, 2, 7, 11, 4, 78, 99, 0, 3};
		 
		 System.out.println("Escriba un numero: ");
		 int elemento = new Scanner(System.in).nextInt();
		 
		 int donde = buscar(aux, elemento);
		 System.out.println(Arrays.toString(aux));
		 if (donde == -1) {
			 System.out.println("Su número no está");
		 } else {
			 System.out.println("Su número está en el índice " + donde );
		 }
	}

}
