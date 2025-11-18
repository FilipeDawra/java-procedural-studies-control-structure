package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		
		do{
			System.out.println("Digite qualquer coisa: Se quiser sair digite 'Por favor'.");
			palavra = entrada.nextLine();
		}
		while(palavra.equalsIgnoreCase("Por favor") == false);
			
		
		entrada.close();
	}

}
		
	
