package arrays;

import java.util.Arrays;

public class EjemploMostrarArray {
	
	/*
	 * Implementar una función el cual va a mostrar un array (pasandole un parametros de enteros).
	 * Y me los muestra como si fuera el método .toString
	 */
	
	public static void mostrarArray(int t[]) {
		
		System.out.print("[");
		for(int i=0; i<=t.length-1; i++) {
			if(i<t.length-1)
				System.out.print(t[i] + ", ");
			else
				System.out.print(t[i]);
		}
		System.out.print("]");
		
		
		/*
		System.out.print("[");
		for (int elemento : t) {
			System.out.print(elemento + ", ");
		}	
		System.out.print("]");
		*/
	}
	
	
	public static void main(String[] args) {
		
		int t[] = {1, 3, 5,7, 9};
		
		System.out.println("Con .toString()");
		System.out.println(Arrays.toString(t));
		
		System.out.println("Con método:");
		mostrarArray(t);
		
	}
	
}
