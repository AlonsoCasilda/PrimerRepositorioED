package dam.m11.ej1;

import java.util.Scanner;

/*Programa Java que llene un array con 10 números enteros que se leen por teclado.
 * A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.
 */

public class Ejercicio3 {

	private static int [] arrayNumeros;
	private static Scanner sc;
	private static int medPos;
	private static int medNeg;
	private static int contPos;
	private static int contNeg;
	private static int sumaPos;
	private static int sumaNeg;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		arrayNumeros = new int [10];
		
		rellenarArray();
		
		analizarArray();
		
		mostarValores();
		
		sc.close();

	}

	private static void mostarValores() {
		System.out.println("La media de valores de los números positivos es: " + medPos);
		System.out.println("La media de valores de los números negativos es: " + medNeg);
		
	}

	private static void analizarArray() {
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (arrayNumeros [i] > 0) {
				contPos++;
				sumaPos = sumaPos + arrayNumeros[i];
				medPos = sumaPos / contPos;
				}
			if (arrayNumeros [i] < 0) {
				contNeg++;
				sumaNeg = sumaNeg + arrayNumeros[i];
				medNeg = sumaNeg / contNeg;
				}
			}
		}

	private static void rellenarArray() {
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduce un numero en posicion " + (i+1));
			arrayNumeros [i] = Integer.parseInt(sc.nextLine());
		}
		
	}

}
