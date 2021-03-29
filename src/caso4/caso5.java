package caso4;
import java.util.Scanner;
public class caso5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"David Arango", "Luisa Gonzales", "Maria Vallejo", "Pedro Ramos"};
		int[] arrNota = {15, 12, 17, 8};
		
		System.out.println("BÚQUEDA DE DATOS");
		System.out.println("================");
		System.out.print("Ingrese código.....: ");
		String codigo = sc.nextLine();
		
		int p = -1;
		
		for (int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo[x])) {
				p = x;
				break;
			}
		}
		
		if (p == -1) {
			System.out.println("================================");
			System.out.println("===== Codigo no encontrado =====");
			System.out.println("================================");
		}
		else  {
			System.out.println("================================");
			System.out.println("====== Codigo Registrado =======");
			System.out.println("================================");
			System.out.println("Código...........: " + arrCodigo[p]);
			System.out.println("Alumno...........: " + arrNombre[p]);
			System.out.println("Nota.............: " + arrNota[p]);
		}
		
		String Estado = "";
		
		if (arrNota[p] >= 13) {
			Estado = "Aprobado";
		}
		else {
			Estado = "Desaprobado";
		}
		
		System.out.println("Estado...........: " + Estado);

	}

}
