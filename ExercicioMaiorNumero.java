package controle;

import java.util.Random;

public class Challenge8MaiorNumero {
	public static void main(String[] args) {
		
		Random lista = new Random();
		
		int proximoNumero = 0;
		int maiorNumero = 0; 
		
		for(int i = 0; i <= 10; i++) {
			int num = lista.nextInt(30);
			if(num > proximoNumero) {
				proximoNumero = num;
				maiorNumero = proximoNumero;
			}
			System.out.print("Número: " + num);
			System.out.println("\nMaior número: "+ maiorNumero);
		}
	}

}
