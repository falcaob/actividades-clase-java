package bucles;

import java.util.Scanner;

public class NumerosHastaNegativo {
	
	/*  
	 * 	Realiza un programa que vaya pidiendo numeros hasta que se introduzca
	 *  un numero en negativo y nos diga cuantos numeros se ha introducido,
	 *  la media de los impares y el mayor de los pares. El numero negativo
	 *  solo se utiliza para indicar el final de la introduccion de datos 
	 *  pero no se incluye en el computo.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Por favor, vaya introduciendo números enteros.");
	    System.out.println("Puede terminar mediante la introducción de un número negativo.");

	    int numeroIntroducido;
	    int numeroDeElementos = 0;//contea los numeros positivos
	    int sumaImpares = 0;
	    int numeroDeElementosImpares = 0;
	    int maximoPar = 0;//Valdra lo que valga el primer numero
	    
	    do {
	      numeroIntroducido =sc.nextInt();
	      
	      if (numeroIntroducido >= 0) {
	        numeroDeElementos++;//si es mayor que cero incremento el numero de elementos.solo cuenta los numeros positivos
	        if ((numeroIntroducido % 2) == 1) { // número impar. Tambien se puede poner !=0;
	          sumaImpares += numeroIntroducido;
	          numeroDeElementosImpares++;
	        } else { // número par
	          if (numeroIntroducido > maximoPar)//para saber cual es el valor maximo de par
	            maximoPar = numeroIntroducido;
	        }
	      }
	    } while (numeroIntroducido >= 0);//mientra numero sea positivo

	    System.out.println("Ha introducido " + numeroDeElementos + " números positivos.");
	    System.out.print("La media de los impares es ");
	    System.out.println(sumaImpares / numeroDeElementosImpares + ".");
	    System.out.println("El máximo de los pares es " + maximoPar + ".");
		
	}

}
