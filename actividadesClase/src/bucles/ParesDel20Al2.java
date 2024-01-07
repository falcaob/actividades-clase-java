package bucles;

public class ParesDel20Al2 {

	public static void main(String[] args) {
		//Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "do-while"
		
		int num = 20;
		
		do {
			
			if (num%2 == 0) {System.out.println(num);}
			num--;
			
		} while (num >= 2);

	}
	
	/*OTRA SOLUCIÓN
	 * int i = 22;
	 * 
	 * do 
	 *   syso(i-=2)
	 * while(i>2);
	 */

}
