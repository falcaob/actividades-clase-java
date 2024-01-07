package arrays;

import java.util.Arrays;

public class Ejemplo9 {
	
	static int primitiva(int apuesta[], int combinacionGanadora[]) {
		int aciertos = 0;
		
		// Cada numero lo voy guardando en a
		// a es una copia del valor del elemento
		for(int a : apuesta) {
			if(Arrays.binarySearch(combinacionGanadora, a) >= 0) {
				aciertos++;
			}
		}
		
		return (aciertos);
	}
	
	public static void main(String[] args) {
		
		int combinacionGanadora[] = {3, 13, 25, 33, 41, 48};
		int apuesta[] = {3, 25, 41, 42, 45, 49};
		System.out.println("Aciertos: " + primitiva(apuesta, combinacionGanadora));
	}

}
