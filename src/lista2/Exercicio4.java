package lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double numero, calculo;
		String texto;
		
		System.out.println("Digite um numero: ");
		numero = in.nextDouble();
		
		if (numero % 2 == 0) {
			calculo = Math.sqrt(numero);
			texto = "O n�mero " + numero + " � par e sua raiz quadrada � " + calculo;
			
		} else {
			calculo = Math.pow(numero, 2);
			texto = "O n�mero " + numero + " � �mpar e seu quadrado � " + calculo;
		}
		System.out.println(texto);
		in.close();
	}	
}