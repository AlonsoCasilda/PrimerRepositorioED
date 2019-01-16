package dam.m11.ej1;

import java.util.Scanner;

/*Programa Java para leer la altura de N personas y calcular la altura media.
 * Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
 * El valor de N se pide por teclado y debe ser entero positivo.
 */

public class Ejercicio5 {
	
	private static Scanner sc;
	private static int personas;
	private static int [] alturas;
	private static double media;
	private static int suma;
	private static int inferior;
	private static int superior;
	

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce cantidad de personas a analizar: ");
		personas = Integer.parseInt(sc.nextLine());
		alturas= new int [personas];
		
		rellenarAlturas();
		
		sumaAlturas();
		
		calculaMedia();
		
		calculaResultados();
		
		muestraResultados();

	}

	private static void muestraResultados() {
		System.out.println("La cantidad de personas por encima de la media es: " + superior);
		System.out.println("La cantidad de personas por debajo de la media es: " + inferior);
	}

	private static void calculaResultados() {
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] < media) {
				inferior++;
			}else {
				superior++;
			}
		}
		
	}

	private static void calculaMedia() {
		media = suma / personas;
		// System.out.println("La media de las alturas de las personas es: " + media);
		
	}

	private static void sumaAlturas() {
		for (int i = 0; i < alturas.length; i++) {
			suma = suma + alturas[i];
			// System.out.println("La suma de las alturas de las personas es: " + suma);
		}
		
	}

	private static void rellenarAlturas() {
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Introduce la altura de la persona " + (i+1));
			alturas [i] = Integer.parseInt(sc.nextLine());
			// System.out.println("La cantidad de alturas introducidas es: " + alturas[i]);
		}
		
	}

}
