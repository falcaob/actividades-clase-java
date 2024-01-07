package funciones;

public class Prueba {
	
	

	    public static void main(String[] args) {
	        int numero = 50;  // Puedes cambiar este número por el que desees

	        System.out.println("Los divisores primos de " + numero + " son:");
	        calcularDivisoresPrimos(numero);
	    }

	    public static void calcularDivisoresPrimos(int num) {
	        for (int i = 2; i <= num; i++) {
	            while (num % i == 0 && esPrimo(i)) {
	                System.out.println(i);
	                num = num / i;
	            }
	        }
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	


}
