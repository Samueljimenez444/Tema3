package parte4;

import java.util.Arrays;

public class Ejercicio61 {

	public static int[] suma(int t[], int numElementos) {
		// Creamos la variable entera lista con una longitud igual a 3
		int[] lista = new int[3];
		// Creamos la variable entera suma
		int suma=0;
		
		// Creamos la variable entera inicio que servira para contabilizar la posicion
		// del array desde 0
		int inicio = 0;
		for(int i=0;i>3;i++){
		for (int j = 0; j <numElementos; j++) {
			suma = t[inicio];
			inicio++;
			lista[i]=suma;
		}
		}
		t.len-(numE-1)
		return lista;
	}

	public static void main(String[] args) {
		int[] tabla = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(suma(tabla, 2)));

	}

}