    /*
    ehPar(int numero) → retorna true se o número for par, false se for ímpar
    calcularMedia(double n1, double n2, double n3) → retorna a média das três notas
    classificarAluno(double media) → retorna uma String com a situação:
    média >= 7 → "Aprovado"
    média >= 5 → "Recuperação"
    abaixo de 5 → "Reprovado"
    No main:
    Leia um número e diga se é par ou ímpar usando ehPar
    Leia 3 notas, calcule a média e classifique o aluno
    */

import java.util.Scanner;

public class Dis3emeio {

        public static boolean ehPar(int numero) {
            return numero % 2 == 0;
        }

        public static double calcularMedia(double n1, double n2, double n3) {
            return (n1+n2+n3)/3;
        }

        public static String classificarAluno(double media) {
            if (media >= 7) return "aprovado";
            if (media >= 5) return "recuperacao";
            return "reprovado";
        }


        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.println("Opa vamos descobrir se seu numero e par ou impar ;) digite o numero desejado: ");

            int numero = sc.nextInt();
        
            if (ehPar(numero)) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }

            System.out.println("digite as 3 notas do aluno e veja sua classificacao");

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = calcularMedia(n1, n2, n3);

            System.out.println("Situação: " + classificarAluno(media));



            sc.close();
        }    
    }
