package arrays;

import java.util.Arrays;

public class MostrarArray {
	
	public static void main(String[] args) {
		
		int t[] = {8, 41, 37, 22, 19};
		
		System.out.println("Se visualiza la referencia al array:");
		System.out.println(t);
		
		System.out.println("Se visualiza el contenido con el formato implementado en toString()");
		System.out.println(Arrays.toString(t));
		
		System.out.println("Visualizamos el contenido con un for con índices");
		for(int i=0; i<=t.length-1; i++) {
			System.out.println(t[i]);
		}
		
		System.out.println("Visualizamos el contenido con un for extendido:");
		// Por cada elemento (que es un entero) del array t....
		for (int elemento : t) {
			System.out.println(elemento);
			// fore me permite obtener copias de los valores
		}
		
	}

}
