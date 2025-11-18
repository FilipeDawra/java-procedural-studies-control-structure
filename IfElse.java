package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		System.out.println("*Par ou Impar*");
		
		String entrada = JOptionPane.showInputDialog("Digite um número");
		
		double num = Double.parseDouble(entrada);
		
		if(num % 2 == 0) {
			System.out.printf("O número %.1f é par.", num);
		}
		
		else 
			System.out.printf("O número %.1f é impar.", num);
		
	}

}
