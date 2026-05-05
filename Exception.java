/*
Cria um programa de calculadora simples com menu (soma, subtração, multiplicação, divisão) que:
Lê dois números do usuário
Trata ArithmeticException pra divisão por zero
Trata InputMismatchException se o usuário digitar texto em vez de número
Cria uma exceção customizada OperacaoInvalidaException lançada quando o usuário escolhe uma opção inválida no menu
Usa finally pra imprimir "Operação finalizada." sempre
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            System.out.println("Escolha a operação: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
            int operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        throw new ArithmeticException("Divisão por zero não é permitida.");
                    }
                    System.out.println("Resultado: " + (num1 / num2));
                    break;
                default:
                    throw new OperacaoInvalidaException("Opção de operação inválida.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada.");
            sc.close();
        }
    }
}

class OperacaoInvalidaException extends RuntimeException {
    public OperacaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
