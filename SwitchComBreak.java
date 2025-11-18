package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.println("Digite sua nota: ");		
		int nota = entrada.nextInt();
		
		
		switch(nota) {
		
		case 10:
			conceito = "A";
			break;
		case 8:
		    conceito = "B";
		    break;
		case 5:
			conceito = "C";
			
			
			
		}
		
		
		System.out.println("Conceito: " + conceito);
		
	}

}
