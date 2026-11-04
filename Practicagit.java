# Practicas
Varios

/*
 * Javier Pinto  
 * Ejerciciosvectores Ejercicio5
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CAPACIDAD = 20;
		int numero [];// declaración
		numero = new int [CAPACIDAD]; // Instanciación
		double media =0 ;
		int suma = 0 ;
		
		Scanner teclado = new Scanner(System.in); 
		
		
		for(int i = 0; i < numero.length ; i++) {
			System.out.println("Introduzca un valor:");
			numero[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < numero.length ; i++) {
			suma = suma + numero[i];
		}
		media = suma / numero.length;
		
		System.out.println("Media:" + media);
	}

}
