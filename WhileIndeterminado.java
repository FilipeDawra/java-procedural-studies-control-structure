package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite qualquer coisa. \nSe quiser sair digite 'sair'.");
		String palavra = " ";
		
		while(palavra.equalsIgnoreCase("sair") == false) {
			System.out.print("\nPalavra: " + palavra);
			palavra = entrada.nextLine();
		}
		
		
	}

}
