package funciones;

import java.util.Random;

public class Aleatorios {
	
	/*
	 * Ejercicio 8
	 * Crea una función que muestre por consola una serie de números aleatorios enteros.
	 * Los parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y 
	 * los valores mínimos y máximos que estos pueden tomar.
	 * 
	 */
	
	public static void main(String[] args) {
        mostrarNumerosAleatorios(5, 1, 10);
    }

    public static void mostrarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        Random rand = new Random();

        System.out.println("Números aleatorios:");

        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = rand.nextInt((maximo - minimo) + 1) + minimo;
            System.out.println(numeroAleatorio);
        }
    }
}
