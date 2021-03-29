package caso4;

import java.util.Scanner;
public class caso4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		Integer[] numero = new Integer[5];
		float suma = 0;
		float promedio;
		
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Ingrese número " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
		}
		
		int contpar = 0, contimpar = 0;
		
		for (int x = 0; x < numero.length; x++) {
			if (numero[x] % 2 == 0) {
				contpar = contpar + 1;
			}
			
			if (numero[x] % 2 != 0) {
				contimpar = contimpar + 1;
			}
		}
		
		for (int x = 0; x < numero.length; x++) {
			suma += numero[x];
		}
		promedio = (suma/numero.length);
		
		System.out.println("===================");
		System.out.println("R E S U L T A D O S");
		System.out.println("===================");
		System.out.println("Cantidad de números pares: " + contpar);
		System.out.println("Cantidad de números impares: " + contimpar);
		System.out.println("Promedio : " + promedio);

	}

}
