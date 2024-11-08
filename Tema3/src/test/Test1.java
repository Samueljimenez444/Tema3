package test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int numero[] = new int[5];
		int numeros[] = new int[5];

		int a[];
		int b[];
		numeros[0] = 15;
		numeros[1] = 5;
		numeros[2] = 9;
		numeros[3] = 2;
		numeros[4] = 1;
		numero[0] = 15;
		numero[1] = 3;
		numero[2] = 4;
		numero[3] = 5;
		numero[4] = 7;
		System.out.println(Arrays.toString(numero));

	System.arraycopy(numero, 2, numeros, 4, 1);
	System.out.println(Arrays.toString(numeros));
	
	}

}
