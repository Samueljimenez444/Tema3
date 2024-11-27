package parte5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
public static int[][] ordenar(int[][] lista) {
	Random rand=new Random();
	int posicionf;
	int posicionc;
	int auxiliar;
	for (int i = 0; i < lista.length; i++) {
		for (int j = 0; j < lista[0].length; j++) {
	posicionc=rand.nextInt(0,lista[0].length);
	posicionf=rand.nextInt(0,lista.length);
			auxiliar=lista[i][j];
			lista[i][j]=lista[posicionf][posicionc];
			lista[posicionf][posicionc]=auxiliar;
		}
	}
	return lista;
}
	public static void main(String[] args) {
		// Creamos la variable entera tabla que servira para almacenar valores
		int[][] tabla;
		// Creamos la variable entera longitud que servira para definir la longitud de
		// la tabla
		int filas;
		// Creamos la variable entera columnas que servira para definir las columnas de
		// la matriz
		int columnas;
		// Creamos la variable entera numero que servira para definir los valores de la
		// tabla
		int numero = 0;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print
		System.out.println("Introduzca las filas de la tabla");
		// Definimos la variable longitud en funcion del input del usuario
		filas = lectura.nextInt();
		// Print
		System.out.println("Introduzca las columnas de la tabla");
		// Definimos las columnas de la tabla en fucion del input del usuario
		columnas = lectura.nextInt();
		// Definimos la longitud de la tabla en funcion de la variables filas y columnas
		tabla = new int[filas][columnas];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.println("Define el valor en la posicion " + (i + 1)+" " + (j + 1));
				numero = lectura.nextInt();
				tabla[i][j] = numero;
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				// Print del array en forma de matriz
				System.out.print(tabla[i][j] + "\t");

			}
			// Salto de linea
			System.out.println();
		}
		ordenar(tabla);
		
		lectura.close();
	}

}
