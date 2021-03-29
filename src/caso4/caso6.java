package caso4;

public class caso6 {

	public static void main(String[] args) {
		String[][] datos = { {"David Arango", "Juan Perez","Fiorella Martinez"},
				 {"Ventanilla", "Puente Piedra", "Los Olivos"}	};

// Datos.length    --> Cantidad de filas de la matriz (2)
// Datos.length[0] --> Cantidad de elementos del arreglo de la primera fila (3)

// Impresion de valores por filas
        System.out.println("========== IMPRESION POR FILAS ==========");
        for (int f = 0; f < datos.length; f++) {
                for (int c = 0; c < datos[0].length; c++)
	                   System.out.print(String.format("%-20s", datos[f][c]) + "\t");

                System.out.println();
        }

        System.out.println();

// Impresion de valores por columnas
	                   System.out.println("========== IMPRESION POR COLUMNAS ==========");
	                   for (int c = 0; c < datos[0].length; c++) {
		                        for (int f = 0; f < datos.length; f++)
			                            System.out.print(String.format("%-20s", datos[f][c]) + "\t");
		
		               System.out.println();
	}

	}

}
