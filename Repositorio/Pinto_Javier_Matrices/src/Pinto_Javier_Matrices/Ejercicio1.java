/*
 * Javier Pinto 
 * Ejercicios de Matrices 
 * Ejercicio1
 * 
 */



package Pinto_Javier_Matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int FILA = 5;
		final int COLUMNA = 5;
		int [][] numero;
		numero = new int [5][5];
		int contador = 0;
		for (int i = 0; i < numero.length;i++) {
			for (int y =0; y< numero[i].length;y++) {
				contador = contador +1;
				numero[i][y] = contador ;
			}
		}
		
		
		
		
		for (int i = 0; i < numero.length;i++) {
			
			for (int y =0; y< numero[i].length;y++) {
				System.out.print(" " + numero[i][y]);
			}
			System.out.println();
		}
	}

}
