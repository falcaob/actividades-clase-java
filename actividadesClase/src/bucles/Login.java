package bucles;

import java.util.Scanner;

public class Login {
	
	//Programa que pide al usuario el login (numero entero) y su contraseña (otro entero)
	//Esto se repite mientras que el usuario introduzca un login distinto de 1809 y contraseña 1234
	//Cuando instroduzca los correctos aparecerá "Acceso permitido"
	
	public static void main(String[] args) {
		
		int login;
		int pass;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			// lo que hay dentro del bucle se tiene que hacer una vez si o si
			System.out.println("Introduce tu usuario:");
			login = sc.nextInt();
			System.out.println("Introduce tu contraseña:");
			pass = sc.nextInt();
			
			if(login != 1809 || pass != 1234) {
				System.out.println("Datos de acceso no válidos");
			}
			
		} while (login != 1809 && pass != 1234);
		
		System.out.println("Acceso Permitido");
		
		sc.close();
		
	}
}
