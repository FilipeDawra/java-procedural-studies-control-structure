package controle;

import java.util.Scanner;

public class Challenge4Primo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número e descubra se ele é primo.");
		int numero = entrada.nextInt();
		
		int contadorDeDivisores = 0;
		
		
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
			
		}
		
		if(contadorDeDivisores == 0) {
			System.out.printf("O número %d é primo.", numero);
		} else {
			System.out.printf("O número %d não é primo.", numero);
		}

		
		
		

}
}


