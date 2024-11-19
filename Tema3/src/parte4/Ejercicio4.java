package parte4;

import java.util.Random;

public class Ejercicio4 {
	public static int buscar(int clave, int t[]) {
		for (int i = 0; i < t.length; i++) {
			if (clave == t[i]) {
				System.out.println(i);
			} else {
				System.out.println(-1);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int tabla[]=buscar(5);
		int secreto= buscar(1);
		System.out.println(tabla);
		System.out.println(secreto);
	}

}
