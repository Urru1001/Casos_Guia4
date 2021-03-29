package caso4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class caso3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		Integer[] numero = new Integer[5];
		
		System.out.println("INGRESO DE NUMEROS");
		System.out.println("==================");
		
		
		for(int x = 0 ; x < numero.length; x++) {
			System.out.println("Numero " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
			
		Arrays.sort(numero);
			
		System.out.println("Numero ordenados ascendentemente");
		System.out.println("===================================");
		for (int j = 0; j < numero.length; j++) 
			System.out.println("Número " + (j + 1) + ": " + numero[j]);
		
		
				Arrays.sort(numero, Collections.reverseOrder());
				
				System.out.println("\nNúmeros Ordenados Descendentemente");
				System.out.println("===================================");
				for (int j = 0; j < numero.length; j++) 
					System.out.println("Número " + (j + 1) + ": " + numero[j]);
		}
	}
}
			
			

	


