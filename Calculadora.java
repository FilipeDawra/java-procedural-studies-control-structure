import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double a;
        double b;
        String operador;


        Scanner entrada = new Scanner(System.in);


            System.out.println("Digite o primeiro número");
            a = entrada.nextDouble();
            System.out.println("Digite o segundo número");
            b = entrada.nextDouble();
            System.out.println("Escolha o tipo de operação: + , -, *, /. ");
            operador = entrada.next();
        switch (operador) {
            case "+":
                System.out.println("Resultado: " + (a + b));
                break;
            case "-":
                System.out.println("Resultado: " + (a - b));
                break;
            case "*":
                System.out.println("Resultado: " + (a * b));
                break;
            case "/":
                if (a == 0 || b == 0) {
                    System.out.println("Divisão por zero não permitida");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }
            entrada.close();
        }


}

