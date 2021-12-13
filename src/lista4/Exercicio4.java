package lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int somaTotal = 0, somaDiagonal = 0;
		
		System.out.println("Digite os valores da matriz:\n");

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("Posi��o [%d][%d]: ", i, j);
					matriz[i][j] = in.nextInt();
			}
		}
				
		System.out.println("Matriz:");
				
		for(int i = 0; i < 3; i++) {
			System.out.println();
			for(int j = 0; j < 3; j++){
				
				somaTotal += matriz[i][j];
				
				if(i == j){
					somaDiagonal += matriz[i][j];
				}
				System.out.print(matriz[i][j] + " ");
			}
		}			
		System.out.println("\n\nSoma dos valores: " + somaTotal);
		System.out.println("\nSoma da diagonal principal: " + somaDiagonal);
		in.close();
	}
}