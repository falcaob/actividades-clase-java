package arrays;

public class EjemploDeCopia {
	
	/*
	 * Esta clase va a tener 2  métodos: hacercopia y el main
	 * hacercopia le doy un array y devuelve una copia de él.
	 */
	
	// es invocado directamente desde la clase
	public static int[] hacercopia(int t[]) {
		
		// Creo un array de la misma longitud que el array que le he pasado
		int copia[] = new int[t.length];
		
		// Recorro t y por cada valor que extraigo lo meto en copia
		// Para saber donde pegarlo necestio el índice
		for(int i=0; i<=t.length-1; i++) {
			copia[i] = t[i];
		}
		
				
		return (copia);	
	}

}
