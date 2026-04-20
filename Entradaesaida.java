import java.util.Scanner;

public class Entradaesaida {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double altura = sc.nextDouble();

        System.out.printf("Ola, %s! Voce tem %d anos e %.2f metros de altura.", nome, idade, altura);
        
        sc.close();
    }
}