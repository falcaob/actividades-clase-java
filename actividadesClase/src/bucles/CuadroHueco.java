package bucles;

import java.util.Scanner;

public class CuadroHueco {

	public static void main(String[] args) {
		//Crea un programa que pida un número de tipo byte al usuario y escriba en pantalla un cuadro hueco de ese ancho,
		//que tendrá un borde formado por asterisco y su interior serán espacios en blancos.
		
		byte lado;
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las dimensiones del cuadrado:");
		lado = sc.nextByte();
		
		for(i=1; i<=lado; i++) {
			for(j=1; j<=lado; j++) {
				if(i==1 || j==1 || i==lado || j==lado) {
					System.out.print(" * ");
				}else {
					System.out.println(" ");
				}
			}
			
			System.out.println(" ");
		}
		
		sc.close();
	}

}
