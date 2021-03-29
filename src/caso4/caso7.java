package caso4;
import java.util.Scanner;
public class caso7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int[][] numero = new int[3][4];
		
		System.out.println("\nLECTURA DE NÚMEROS");
		System.out.println("==================");
		
		int num_mayor = 0, num_menor = 0;
		float promedio = 0, suma = 0;
		
		for (int f = 0; f < numero.length; f++) {
			System.out.println("\nDatos de la Fila: " + (f +1));
			System.out.println("==================");
			
			for (int c = 0; c < numero[0].length; c++) {
				System.out.print("Número " + (c + 1) + ": ");
				numero[f][c] = sc.nextInt();
				
				suma = suma + numero[f][c];
				promedio = suma / 12;
				
				if (f == 0 && c == 0) { 
					num_mayor = numero[0][0];
				}
				
				if (numero[f][c] > num_mayor) num_mayor = numero[f][c];
			
				
			
				if (f == 0 && c == 0) { 
				num_menor = numero[0][0];
				}
			
				if (numero[f][c] < num_menor) num_menor = numero[f][c];
		
			}
			}
		
		
		
		System.out.println("================================");
		System.out.println("========== RESULTADOS ==========");
		System.out.println("================================");
		System.out.println("Número mayor........: " + num_mayor);
		System.out.println("Número menor........: " + num_menor);
		System.out.println("Sumatoria...........: " + suma);
		System.out.println("Promedio............: " + promedio);
		

	}

}
