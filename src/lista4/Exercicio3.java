package lista4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		
		System.out.println("Dados da matriz N1:\n");
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 6; j++){
				System.out.printf("Posição [%d][%d]: ", i, j);
				n1[i][j] = in.nextInt();
			}
		}
				
		System.out.println("\nDados da matriz N2:\n");
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 6; j++){
				System.out.printf("Posição [%d][%d]: ", i, j);
				n2[i][j] = in.nextInt();
				}
			}
				
		System.out.println("\nMatriz M1");
				
		for(int i = 0; i < 4; i++){
			System.out.println();
			for(int j = 0; j < 6; j++){
				m1[i][j] = n1[i][j] + n2[i][j];
				System.out.print(m1[i][j] + " ");
			}
		}
				
		System.out.println("\n\nMatriz M2");
				
		for(int i = 0; i < 4; i++){
			System.out.println();
			for(int j = 0; j < 6; j++){
				m2[i][j] = n1[i][j] - n2[i][j];
				System.out.print(m2[i][j] + " ");
			}
		}
		in.close();
	}
}