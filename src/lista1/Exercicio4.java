package lista1;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("Digite tr�s numeros inteiros positivos:");
		
		System.out.println("Valor de A: ");
		a = in.nextInt();
		
		System.out.println("Valor de B: ");
		b = in.nextInt();
		
		System.out.println("Valor de C: ");
		c = in.nextInt();
		
		r = Math.pow((a + b), 2.0);
		s = Math.pow((b + c), 2.0);
		
		d = (r + s) /2;
		
		System.out.println("Resultado:\nO valor de D �: " + d);
		
		in.close();
	}
}