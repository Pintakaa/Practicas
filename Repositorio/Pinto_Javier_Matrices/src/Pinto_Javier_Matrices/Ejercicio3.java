/*
 * Javier Pinto  
 * Ejercicios de Matrices 
 * Ejercicio3
 * 
 */

package Pinto_Javier_Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int n =0;
		int m=0;
		
		System.out.print("Introduzca el valor 'n' corresponde a las filas: ");
		n=teclado.nextInt();
		System.out.print("Introduzca el valor 'm' corresponde a las columnas: ");
		m=teclado.nextInt();
		
		final int FILA=n;
		final int COLUMNA=m;
		int matriz[][];
		matriz = new int [FILA][COLUMNA];
		int mayores=0;
		int menores=0;
		int iguales=0;
		
		
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print("Introduzca el valor a introducir en la matriz: ");
				int numero =teclado.nextInt();
				
				matriz[i][j]= numero;
			}
			
		}
		
		for(int i =0;i <matriz.length;i++ ) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(" " + matriz[i][j]);
				
				
			}
			System.out.println();
		}
		for(int i =0;i <matriz.length;i++ ) {
			for(int j=0;j<matriz[i].length;j++) {
	
				
				if(matriz[i][j] > 0) {
					mayores = mayores +1;
				}
				if(matriz[i][j] == 0) {
					iguales = iguales +1;
				}
				if(matriz[i][j] < 0) {
					menores = menores +1;
				}
				
			}

		}
		
		System.out.println("Números mayor a 0: " + mayores);
		System.out.println("Números iguales a 0: " + iguales);
		System.out.println("Números menores a 0: " + menores);
	}

}
