package funciones;

public class CalcularPrimeraLetra {
	/*
	 * Crea una función que devuelva la primera letra de una cadena de texto.
	 * Probar esta función para calcular la primera letra de la frase "Hola".
	 * Tengo dos funciones: uno al que paso parametro de tipo string y calcula la primera letra y otro main
	 */
	
	//funcion
	public static char devuelvePrimeraLetra (String cadena) {
		//char letra1 = cadena.charAt(0);
		return cadena.charAt(0);	
	}
	
	public static void main(String[] args) {
		
		System.out.println("La primera letra de la cadena es: " + 
		devuelvePrimeraLetra("Hola"));
		
		//texto = teclado.nextLine(); para que Scanner devuelva un String (me lo convierte)
		// next solo controla hasta el próximo espacio en blanco
		
	}
	
	//cadena es un objeto de clase String que tiene acceso a todos sus métodos
}
