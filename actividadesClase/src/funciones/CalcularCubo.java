package funciones;

public class CalcularCubo {
	/*
	 * Crea una función que calcule el cubo de un número real(float) que se indique como parámetro.
	 * El resultado deberá ser otro número real. Probar esta función para calcular el cubo 3.2 y el 5.
	 */
	
	//SE TIENE QUE HACER CON EL RETURN
	
	//funciones
	public static void calculoCubo(float cubo) {
		float operacionCubo = cubo * cubo * cubo;
		System.out.println(operacionCubo);
	}
	
	public static void main(String[] args) {
		
		//System.out.println("El cubo de 5.0: " + calculoCubo(5.0f));
		CalcularCubo.calculoCubo(5.0f);
		CalcularCubo.calculoCubo(3.2f);
	}
	
	//procedimiento hace algo que no devuelve valor
	//funcion si devuelve algo

}
