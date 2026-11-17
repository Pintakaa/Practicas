/*
 * Javier Pinto  
 * Ejercicios de Matrices 
 * Ejercicio2
 * 
 */


package Pinto_Javier_Matrices;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int FILA = 11;
		final int COLUMNA = 11;
		int [][] numero;
		numero = new int [10][10];

		
		for(int i =0;i <numero.length;i++ ) {
			
			for(int y=0;y<numero[i].length;y++) {
				
				numero[i][y]= i*y;
			}
		}
		
		
		
		for(int i =0;i <numero.length;i++ ) {
			for(int y=0;y<numero[i].length;y++) {
				System.out.print(" " + numero[i][y]);
			}
			System.out.println();
		}
		
		
	}

}
