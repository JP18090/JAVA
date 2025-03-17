package Atv17032025;


public class Vetor {
    private Gamer[] lista;
    private int tamanho;

    public Vetor(int capacidade) {
        lista = new Gamer[capacidade];
        tamanho = 0;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public boolean estaCheio() {
        return tamanho == lista.length;
    }

    // Método para inserir um Gamer de forma ordenada pelo score (maior para menor)
    public void inserir(Gamer gamer) {
        if (estaCheio()) {
            System.out.println("A lista está cheia. Não é possível adicionar mais jogadores.");
            return;
        }

        int i;
        for (i = tamanho - 1; i >= 0 && lista[i].getScore() < gamer.getScore(); i--) {
            lista[i + 1] = lista[i];
        }
        lista[i + 1] = gamer;
        tamanho++;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[tamanho - 1] = null;
        tamanho--;
    }

    public Gamer getPrimeiro() {
        if (!estaVazio()) {
            return lista[0];
        }
        return null;
    }

    public void exibirLista() {
        if (estaVazio()) {
            System.out.println("A lista está vazia.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(lista[i]);
            }
        }
    }
}
