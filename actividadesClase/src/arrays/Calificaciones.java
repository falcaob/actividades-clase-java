package arrays;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		
		/* Array de enteros con las calificaciones de los alumnos de 4ºA y 4ªB.
		 * Hay 3 alumnos en cada curso.
		 * Lo primero es crear los arrays.
		 * Tengo que preguntar tres notas y meterlas en el array correspondiente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int notas1[] = new int[3]; // Asigno un bloque de 3 enteros en la memoria
		int notas2[] = new int[2];
		
		System.out.println("Dame las calificaciones de 4ºA");
		
		/*
		 * Para que no nos pasemos de largo en los índices.
		 * i<=notas1.length-1 ó i<notas1.length
		 */
		for(int i=0; i<notas1.length; i++) {
			// (i+1) muestro la posiciom del elemento
			System.out.println("Dame la calificación del alumno " + (i+1));
			// al elemento de indice i de notas 1 le asigno el valor que el usuario me de por teclado
			notas1[i] = sc.nextInt();
		}
		
		// Recorrido para imprimir los elementos del array
		System.out.println("Las calificaciones de 4ºA son: ");
		for(int i=0; i<notas1.length; i++) {
			System.out.print( notas1[i] + " ");
		}
		
		System.out.println("Dame las calificaciones de 4ºB");
		
		for(int i=0; i<notas2.length; i++) {
			System.out.println("Dame la calificación del alumno " + (i+1));
			notas2[i] = sc.nextInt();
		}
		
		System.out.println("Las calificaciones de 4ºB son: ");
		for(int i=0; i<notas2.length; i++) {
			System.out.print( notas2[i] + " ");
		}
		

	}

}
