package arrays;

public class EjemploFuncionesArrays {
	
	public static void cambiar (int a[]) {
		
		for(int i=0; i<=a.length-1; i++) {
			// Cambio valores del Array
			a[i] = a[i] +10;
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {1, 3, 5,7, 9};
		
		System.out.println("El Array antes de llamar a la función: ");
		// Imprimir Array
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+ "\t"); //Para que me los separe
		}
		System.out.println("");
		
		cambiar(a);
		
		System.out.println("El Array después de llamar a la función: ");
		// Imprimir Array
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+ "\t"); //Para que me los separe
		}
		System.out.println("");
	}
}
