package arrays;

public class EjemploFunciones {
	
	// Recibe una copia de un valor (no la referencia) y lo guarda en una var local que también se llama a
	public static void cambiar(int a) {
		a = a + 1;
		System.out.println("Valor de la variable local a en la función cambiar");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("Valor de a en main antes de llamar a la función cambiar");
		System.out.println(a);
		
		cambiar(a);
		
		System.out.println("Valor de a en main después de llamar a la función cambiar");
		System.out.println(a);
	}
	
	
	/*
	 * Cuando paso por parámetros a una función un array estoy modificando el array original porque
	 * es una refrencia, no un valor
	 * 
	 * PASO DE PARÁMETROS POR COPIA (variable escalar)
	 * PASO DE PARÁMETROS POR REFERECIA (array)
	 */

}
