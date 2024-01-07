package bucles;

import java.util.Scanner;

public class CajaFuerte {

	public static void main(String[] args) {
		// Realiza el control de acceso a una caja fuerte. La combinación será un número
		// de 4 cifras.
		// El programa nos pedirá la combinación para abrirla.
		// Si no acertamos, el programa mostrará "Lo siento, esa no es la combinación"
		// Y si acertamos, "La caja fuerte se ha abierto satisfactoriamente"
		// Tendramos 4 oportunidades para abrir la caja fuerte

		final int combi = 1234;
		int intentosMax = 4;
		int intento;

		Scanner scanner = new Scanner(System.in);

		for (int intentoActual = 1; intentoActual <= intentosMax; intentoActual++) {
			
			System.out.print("Intento " + intentoActual + ". Ingresa la combinación de 4 dígitos: ");
			intento = scanner.nextInt();

			if (intento == combi) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
				// Debe parar si el intento es correcto (break)
			} else {
				System.out.println("Lo siento, esa no es la combinación.");

				if (intentoActual < intentosMax) {
					System.out.println("Te quedan " + (intentosMax - intentoActual) + " intentos.");
				} else {
					System.out.println("Has agotado tus intentos. La caja fuerte permanece cerrada.");
				}
			}
		}
		
		scanner.close();

	}

}
