package parte3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos un array bidimensional entero notas con una longitud de 4x5
		int notas[][] = new int[4][5];
		// Creamos la variable entera valores que servira para almacenar los datos del
		// usuario
		int valores;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);

		int notaMax = 0;
		int notaMin = 0;
		int media = 0;
		/*
		 * Creamos un bucle for anidado que ira rellenando el array por filas y columnas
		 * en funcion del input del usuario
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
				notas[i][j] = lectura.nextInt();

			}
		}

		// Creamos un bucle for anidado que recorrera el array al completo
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				// Print del array en forma de matriz
				System.out.print(notas[i][j] + "\t");
				media+=notas[i][j]/5;
			}
			// Salto de linea
			System.out.println();
		}
		// Cierre Scanner
		lectura.close();
		System.out.println(media);
	}
}
