package Atv17032025;

public class Main {
    public static void main(String[] args) {
        Vetor ranking = new Vetor(10);

        ranking.inserir(new Gamer("Carlos", 1200));
        ranking.inserir(new Gamer("Ana", 1500));
        ranking.inserir(new Gamer("Pedro", 1100));
        ranking.inserir(new Gamer("Mariana", 1700));
        ranking.inserir(new Gamer("Lucas", 1300));

        // Exibindo a lista de scores
        System.out.println("Lista de Scores:");
        ranking.exibirLista();

        // Mostrando quem está na primeira posição
        System.out.println("\nPrimeiro colocado:");
        System.out.println(ranking.getPrimeiro());

        // Removendo o jogador na 3ª posição (índice 2)
        System.out.println("\nRemovendo o jogador na 3ª posição...");
        ranking.remover(2);

        // Exibindo a lista atualizada
        System.out.println("\nLista de Scores após remoção:");
        ranking.exibirLista();
    }
}