package dam.m11.ej1;

import java.util.Scanner;

public class Ejercicio1 {
	
	/* Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
	 * Muestra por consola el �ndice y el valor al que corresponde.
	 * Haz dos m�todos, uno para rellenar valores y otro para mostrar.*/
		//Commentario
		private static int [] arrayNumeros;
		private static Scanner sc;
		
		public static void main(String[] args) {
			
			sc = new Scanner(System.in);
			arrayNumeros = new int [10];
			
			rellenarArray();
			
			mostrarArray();
			
			sc.close();
			

	}

		private static void mostrarArray() {
			for (int i = 0; i < arrayNumeros.length; i++) {
				System.out.println("Introduce el valor de la posici�n " + i);
				arrayNumeros[i] = Integer.parseInt(sc.nextLine());
			}
			
		}

		private static void rellenarArray() {
			for (int i = 0; i < arrayNumeros.length; i++) {
				System.out.println("En la posici�n " + i 
						+ " se encuentra el valor " + arrayNumeros[i]);
			
		}

		}
		
}
