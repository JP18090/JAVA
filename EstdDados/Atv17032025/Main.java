package Atv17032025;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Criando a Lista Linear para armazenar até 10 jogadores
        Vetor ranking = new Vetor(10);

        // Adicionando jogadores 
        System.out.print("Digite o nome do jogador: ");
        String nome = sc.nextLine();
        System.out.print("Digite o score deste jogador: ");
        int score = sc.nextInt();
        ranking.add(nome, score);

        // Jogadores ja inseridos 
        ranking.add("Mike", 1105);
        ranking.add("Rob", 750);
        ranking.add("Paul", 720);
        ranking.add("Anna", 660);
        ranking.add("Rose", 590);
        ranking.add("Jack", 510);

        System.out.println("Lista de Scores:");
        ranking.exibirLista();

        // Mostrando quem está na primeira posição
        System.out.println("\nPrimeiro colocado: " + ranking.getPrimeiro());

        // Removendo o jogador da 3ª posição
        ranking.remover(2);
        System.out.println("\nLista após remover o jogador da 3ª posição:");
        ranking.exibirLista();
        
        // Exibindo a lista atualizada
        System.out.println("\nLista de Scores após remoção:");
        ranking.exibirLista();

        // Adicionando um novo jogador na 2ª posição
        System.out.println("\nAdicionando o jogador jill na 2ª posição...");
        ranking.add("jill", 740);

        System.out.println("\nLista de Scores após adicionar jill na posição 2:");
        ranking.exibirLista();

        // Testando o metodo achaPos
        System.out.print("Digite o score do jogador que deseja saber a posição: ");
        int pontosProcurados = sc.nextInt();
        int posicao = ranking.achaPos(pontosProcurados);

        if (posicao != -1) {
            System.out.println("\nO jogador com " + pontosProcurados + " pontos está na posição: " + posicao);
        } else {
            System.out.println("\nNenhum jogador encontrado com " + pontosProcurados + " pontos.");
        }
    }
}
