package dam.m11.ej1;

import java.util.Scanner;

/*Programa Java que lea 10 números enteros por teclado y los guarde en un array.
*Calcula y muestra la media de los números que estén en las posiciones pares del array.
*Considera la primera posición del array (posición 0) como par.*/


public class Ejercicio4 {
	
	private static int [] arrayNumeros;
	private static Scanner sc;
	private static int contPares = 0;
	private static int sumaPares = 0;
	private static int mediaPares = 0;
	

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		arrayNumeros = new int [10];
		
		rellenarArray();
		
		mostrarArray();
		
		analizarArray();
		
		mostrarResultados();
		

	}


	private static void mostrarArray() {
		System.out.println("\n{");
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println(arrayNumeros[i] + "");
		}
		
		System.out.println("}");
	}


	private static void mostrarResultados() {
		System.out.println("La media de la suma de los números de las posiciones pares del array es : " + mediaPares);
		
	}

	private static void analizarArray() {
		for (int i = 0;  i < arrayNumeros.length; i++) {
			if (i % 2 == 0) {
				contPares++;
				sumaPares = sumaPares + arrayNumeros [i];
				mediaPares = sumaPares / contPares;
			}
		}
	}
	
	private static void rellenarArray() {
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduce el valor en posición " + i);
			arrayNumeros [i] = Integer.parseInt(sc.nextLine());
		}
		
	}

}
