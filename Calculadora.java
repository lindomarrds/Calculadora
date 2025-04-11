
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora simples");
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);
        
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
                
            case '-':
                resultado = num1 - num2;
                break;
                
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por 0 não é permitida.");
                operacaoValida = false;
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                operacaoValida = false;
                
        }
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }
        sc.close();
    }
    
}
