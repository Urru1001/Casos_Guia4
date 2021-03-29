package caso4;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numero = new int[5];
		
		System.out.println("INGRESO DE NUMEROS");
		System.out.println("==================");
		int num_mayor = 0, num_menor = 0, sumatoria = 0;
		
		for(int x = 0 ; x < numero.length; x++) {
			System.out.println("Numero " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
			
			if(x == 0) {
				num_mayor = numero[0];
				num_menor = numero[0];
				
			}
			if (numero[x] > num_mayor) num_mayor = numero[x];
			
			if (numero[x] < num_menor) num_menor = numero[x];
			
			sumatoria += numero[x];
		}
		
		System.out.println("\n --R E S U L T A D O S--");
		System.out.println("===========================");
		System.out.println("Numero mayor: " + num_mayor);
		System.out.println("Numero menor: " + num_menor);
		System.out.println("Sumatoria: " + sumatoria);

	}

}
