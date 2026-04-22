/*
A proposta é um sistema de cadastro de alunos com as seguintes funcionalidades:
Cadastrar aluno — nome e 3 notas
Listar alunos — mostra todos com média e situação (aprovado/recuperação/reprovado)
Buscar aluno — pelo nome, mostra os dados dele
Sair
O menu fica num loop até o usuário escolher sair.
Estrutura sugerida:
Um ArrayList pra guardar os nomes
Outro ArrayList pra guardar as médias
Métodos separados pra calcularMedia, classificarAluno, e o que achar necessário
Um switch pro menu
*/

import java.util.Scanner;
import java.util.ArrayList;

public class MiniProjetoDia5 {

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1+n2+n3)/3;
    }

    public static String classificarAluno(double media) {
        if (media >= 6)
            return "aprovado";
        if (media >= 4)
            return "recuperacao";
        return "reprovado";
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("bem vindo ao sistema de cadastro de alunos");

        System.out.println("escolha uma opcao: \n1 - cadastrar aluno \n2 - listar alunos \n3 - buscar aluno \n4 - sair");
        int opcao = sc.nextInt();

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> medias = new ArrayList<>();


        do {
            System.out.println("escolha uma opcao: \n1 - cadastrar aluno \n2 - listar alunos \n3 - buscar aluno \n4 - sair");
            opcao = sc.nextInt();
        switch (opcao) {
            case 1: System.out.print("Digite o nome do aluno: ");
                    String nome = sc.next();
                    System.out.print("Digite a primeira nota: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Digite a segunda nota: ");    
                    double n2 = sc.nextDouble();
                    System.out.print("Digite a terceira nota: ");
                    double n3 = sc.nextDouble();
                    double media = calcularMedia(n1, n2, n3);
                    nomes.add(nome);
                    medias.add(media);
                    break;
                
            case 2: for (int i = 0; i < nomes.size(); i++) {
                        String situacao = classificarAluno(medias.get(i));
                        System.out.println((i + 1) + ". " + nomes.get(i) + " - Media: " + medias.get(i) + " - Situacao: " + situacao);
                    }
                    break;

            case 3: System.out.print("Digite o nome do aluno para buscar: ");
                    String nomeBusca = sc.next();
                    if (nomes.contains(nomeBusca)) {
                        int posicao = nomes.indexOf(nomeBusca);
                        String situacao = classificarAluno(medias.get(posicao));
                        System.out.println("Aluno: " + nomes.get(posicao) + " - Media: " + medias.get(posicao) + " - Situacao: " + situacao);
                    } else {
                        System.out.println("Aluno '" + nomeBusca + "' nao encontrado.");
                    }
                    break;

            case 4: System.out.println("Saindo do sistema. Obrigado por usar!");
                    break;
        
        
            default: System.out.println("erro, algo inesperado aconteceu, tente novamente!");
                break;
        }
            } while (opcao != 4);
        sc.close();
    }
}
