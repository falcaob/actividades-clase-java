package bucles;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario un número entero largo y muestre cuáles son sus divisores (aquellos entre los que se puede
		//dividir, obteniendo como resto 0)
		
		//cuando sé número exacto utilizado FOR
		
		long numUser, i;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		numUser = sc.nextLong();
		
		System.out.println("Los divisores del número " + numUser + " son: ");
		
		//1ª iteración. El resultado entre 50 es 0? Entonces imprime y sumo uno más
		for(i = numUser; i>0; i--) {
			//si el resto de la vision entre n e i es 0
			if(numUser%i == 0) {
				System.out.print("\t" + i);
				cont++;
			}
		}
		
		System.out.println();
		System.out.println("Tiene " + cont + " dividores");
		
		sc.close();
		
	}

}
