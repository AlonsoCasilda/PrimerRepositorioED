package dam.m11.ej1;

import java.util.Scanner;

/*Programa Java que guarda en un array 10 n�meros enteros que se leen por teclado.
 * A continuaci�n se recorre el array y calcula cu�ntos n�meros son positivos, cu�ntos negativos y cu�ntos ceros.
 */

public class Ejercicio2 {

	private static int[] arrayNumeros;
	private static Scanner sc;
	private static int contPos = 0;
	private static int contNeg = 0;
	private static int contCeros = 0;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		arrayNumeros = new int[10];

		rellenarArray();

		analizarArray();

		mostrarResultados();

		sc.close();

	}

	private static void mostrarResultados() {
		System.out.println(" La cantidad de n�meros positivos es : " + contPos);
		System.out.println(" La cantidad de n�meros negativos es : " + contNeg);
		System.out.println(" La cantidad de ceros es : " + contCeros);

	}

	private static void analizarArray() {
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros[i] > 0) {
				contPos++;
			}
			if (arrayNumeros[i] < 0) {
				contNeg++;
			}
			if (arrayNumeros[i] == 0) {
				contCeros++;
			}

		}

	}

	private static void rellenarArray() {
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduce un n�mero en posici�n " + i);
			arrayNumeros[i] = Integer.parseInt(sc.nextLine());
		}

	}

}
