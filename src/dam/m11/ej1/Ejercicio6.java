package dam.m11.ej1;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea un array de n�meros donde le indicamos por teclado
 * el tama�o del array, rellenaremos el array con n�meros
 * aleatorios entre 0 y 9, al final muestra por pantalla
 * el valor de cada posici�n y la suma de todos los valores.
 * Haz un m�todo para rellenar el array (que tenga como
 * par�metros los n�meros entre los que tenga que generar),
 * para mostrar el contenido y la suma del array y un m�todo
 * privado para generar n�mero aleatorio (lo puedes usar
 * para otros ejercicios).
 * @author Auto
 *
 */
public class Ejercicio6 {
	
	private static Scanner sc;
	private static int [] array;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		rellenarArray();
		mostrarArray();
		sumarArray();
		
		sc.close();
	}

	private static void sumarArray() {
		
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i]; // suma = suma + array[i];
		}
		System.out.println("\nLa suma de los valores del array es: "
		                   +suma + ".");
	}

	private static void mostrarArray() {
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array [i] + " ");
		}
		System.out.println("]");
	}

	private static int generarAleatorio() {
		
		Random rd = new Random();
		int num = rd.nextInt(9+1);
		return num;
	}

	private static void rellenarArray() {
		
		System.out.println("Introduce el tama�o del array:");
		int x = Integer.parseInt(sc.nextLine());
		
		array = new int [x];	
		for (int i = 0; i < array.length; i++) {
			array [i] = generarAleatorio();
			//(int)Math.floor(Math.random()*9;
		}
		
	}

}