package dam.m11.ej1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	
	private static Scanner sc;
	private static int [] arrayNumAleatorio;
	private static Random rnd;
	private static int superior = 0;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		rnd = new Random();
		arrayNumAleatorio =new int [solicitarNumeroPrimo()];
		rellenarArray();
		comprobarMayorNumero();
		System.out.println("El mayor es " + superior + " y generados: " + Arrays.toString(arrayNumAleatorio));
		sc.close();
	}
	private static void comprobarMayorNumero() {
		for (int i = 0; i < arrayNumAleatorio.length; i++) {
			if (arrayNumAleatorio [i] > superior) {
				superior = arrayNumAleatorio[i];
			}
		}
	}
	private static void rellenarArray() {
		for(int i = 0; i < arrayNumAleatorio.length; i++) {
			arrayNumAleatorio[i] = generarAle(200, 3);
		}
	}
	private static int generarAle(int max, int min) {
		int numero;
		boolean numeroPrimo = true;
		do {
			numero = rnd.nextInt(max - min + 1) + min;
			numeroPrimo = true;
			for (int i = 2; i < numero / 2 && numeroPrimo; i++) {
				if (numero % i == 0) {
					numeroPrimo = false;
				}
			}
		} while (!numeroPrimo);
		return numero;
	}
	private static int solicitarNumeroPrimo() {
		System.out.println("¿De que tamaño vamos a terner el array?");
		int numero = Integer.parseInt(sc.nextLine());
		return numero;
	}
}