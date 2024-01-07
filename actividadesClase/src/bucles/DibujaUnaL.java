package bucles;

import java.util.Scanner;

public class DibujaUnaL {
	/*
	 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
	 * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad de la altura más uno.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura de la L:");
		int altura, i, j;
		altura = sc.nextInt();
		
		for(i = 1; i <= altura; i++) {
			for(j = 1; j <= altura; j++) {
				
				if (i <= altura / 2 || i <= altura) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
				
			}
			
			System.out.println(); // Nueva línea después de cada fila
			
		}
		
		
	}

}
