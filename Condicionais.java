import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {

            System.out.print("Digite um número valido: ");
            int numero = sc.nextInt();
            
            if (numero > 0) {
                for (int i = 1; i <= numero; i++) {
                    System.out.println(i);
                }
            }

            else if (numero == 0) {
                System.out.println("numero igual a zero, nada a listar");
            }

            else {
                System.out.println("Erro fatal - numero negativo, impossivel listar");
            }

            System.out.print("Deseja repetir? (s para sim): ");
            resposta = sc.next();

        }while (resposta.equals("s"));


        sc.close();
    }
}