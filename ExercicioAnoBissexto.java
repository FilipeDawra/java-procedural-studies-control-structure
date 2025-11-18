package controle;

import java.time.Year;
import java.util.Scanner;

public class ChallengeLeapYear {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o ano e descubra se é bissexto: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = Year.isLeap(ano);
		
		if(bissexto == true) {
		
		System.out.printf("O ano %d é bissexto.", ano);
		
		} else 
				System.out.printf("O ano %d não é bissexto.", ano);
				
		
	}

}
