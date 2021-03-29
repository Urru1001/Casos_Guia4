package caso4;
import java.util.Scanner;
import java.util.ArrayList;
public class caso8 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<Integer> arrEdad = new ArrayList<Integer>();
		ArrayList<Integer> arrEstado = new ArrayList<Integer>();
		
		String rp = "S", nombre = "";
		int nr = 0, edad = 0;
		
		while (rp.equals("S") || rp.equals("s")) {
			nr++;
			
			System.out.println("      REGISTRO N. " + nr);
			System.out.println("============================");
			
			System.out.print("Nombre........: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad..........: ");
			edad = sc.nextInt();
			
			arrNombre.add(nombre);
			arrEdad.add(edad);
			
			sc.nextLine();
			
			rp = "";
			
			while(!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n") ) {
				System.out.print("¿Continuar registro [S|N]?: ");
				rp = sc.nextLine();
				
				
				if(!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n") ) {
					System.out.println("Solo escriba S o N");
				}
			}
			
		}
		
		// Impresion del contenido de los ArrayList
		System.out.println("\n == DATOS REGISTRADOS == ");
		System.out.println("=========================");
		System.out.println("");
		
		System.out.println("Alumno(a)" + "\t\t" + "Edad" + "\t\t" + "Estado" + "\t\t\t" + "Etapa");
		System.out.println("==========" + "\t\t" + "====" + "\t\t" + "======" + "\t\t\t" + "=====");
		
		for (int i = 0; i< arrNombre.size(); i++) {
			System.out.println(arrNombre.get(i) + "\t\t" + arrEdad.get(i) + " años\t\t" + VerMensaje(arrEdad.get(i)) + "\t\t" +  VerEtapa(arrEdad.get(i)));
		}

	}
	
	// Crear Metodo
	// Funcion (que devuelve un valor)
	
	public static String VerMensaje(int edad) {
		String mensaje = "Menor de edad";
		
		if (edad >= 18) mensaje = "Mayor de edad";
		
		return mensaje;
	}
	
	public static String VerEtapa(int edad) {
		String mensaje = "";
		
		if (edad <= 10) 
			mensaje = "Niñez";
		else if (edad >= 11 && edad <= 17) 
			mensaje = "Adolescente";
		else if (edad >= 18 && edad <= 24) 
			mensaje = "Juventud";
		else if (edad >= 25 && edad <= 59) 
			mensaje = "Adulto";
		else if (edad >= 60) 
			mensaje = "Adulto mayor";
		
		return mensaje;
		

	}

}
