/*
Usa um ArrayList<String> para armazenar nomes
Pede ao usuário quantos nomes quer cadastrar
Lê os nomes e adiciona no ArrayList
Depois exibe todos os nomes cadastrados com a posição — assim:
1. Ale
2. João
3. Maria
Pergunta um nome pra buscar — se estiver na lista, mostra a posição, se não estiver, diz que não foi encontradow
Dica: ArrayList tem um método .contains() que retorna true se o elemento estiver na lista, e .indexOf() que retorna o índice.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos nomes deseja cadastrar em sua lista?");
        int tamanhoLista = sc.nextInt();
        ArrayList <String> nomes = new ArrayList<>();

        for (int i = 0; i < tamanhoLista; i++) {
            System.out.print("Digite o nome a ser cadastrado: ");
            String nome = sc.next();
            nomes.add(nome);
        }

        System.out.println("Nomes cadastrados:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". " + nomes.get(i));
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = sc.next();
        if (nomes.contains(nomeBusca)) {
            int posicao = nomes.indexOf(nomeBusca) + 1; // +1 para exibir a posição correta
            System.out.println("O nome '" + nomeBusca + "' está na posição: " + posicao);
        } else {
            System.out.println("O nome '" + nomeBusca + "' não foi encontrado na lista.");
        }
        
        sc.close();
    }
}
