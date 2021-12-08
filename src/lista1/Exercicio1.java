package lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
			
		System.out.println("Digite sua idade em anos, meses e dias\n");		
		System.out.println("Sua idade em dias: " + leitura());	
	}
	
	private static int leitura() {
		Scanner in = new Scanner(System.in);
		String info[] = {"Anos", "Meses", "Dias"};
		int soma = 0, num = 0;
		
		for(int i = 0; i < info.length; i++) {
			
			System.out.print(info[i]+": ");
			num = in.nextInt();
			
			switch (i) {
				case 0:
					soma += num * 365;
					break;
				case 1:
					soma += num * 30;
					break;
				case 2:
					soma += num;
					break;
			}	
		}
		in.close();
		return soma;
	}
}
