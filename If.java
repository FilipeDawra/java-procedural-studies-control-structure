package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite a sua média: ");
		Double media = entrada.nextDouble();
		
		if(media > 7) {
			System.out.printf("Sua nota é: %.1f. Você está aprovado.", media);
		}
		
		if(media < 7 && media > 5) {
			System.out.printf("Sua nota é %.1f. Você está de recuperação.", media);
		}
		
		boolean criterioDeReprovacao = media < 5;
		if(criterioDeReprovacao) {
			System.out.printf("Sua nota é %.1f. Infelizmente você está reprovado.", media);
		}
		
		entrada.close();
	}

}
