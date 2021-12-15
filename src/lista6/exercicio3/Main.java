package lista6.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<String> estoque = new ArrayList<>();
		
		estoque.add("Meias");
		estoque.add("Sapato");
		estoque.add("Luvas");
		estoque.add("Chapéu");
		
		
		for (String item : estoque) {
			System.out.println(item);
		}
		
		estoque.remove("Meias");
		
		for (String item : estoque) {
			System.out.println(item);
		}
		
	}
}
