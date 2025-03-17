package Atv17032025;

public class Vetor {
    private Gamer[] lista;
    private int tamanho;

    public Vetor(int capacidade) {
        lista = new Gamer[capacidade];
        tamanho = 0;
    }

    public boolean isEmpty() {
        if (tamanho == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        return tamanho == lista.length;
    }

    // Método para adicionar um jogador ordenado por score
    public void add(String nome, int score) {
        if (isFull()) {
            System.out.println("A lista está cheia. Não é possível adicionar mais jogadores.");
            return;
        }

        Gamer novoGamer = new Gamer(nome, score);
        int posicao = 0;

        // Encontrar a posição correta para inserir o jogador (mantendo ordem decrescente de score)
        while (posicao < tamanho && lista[posicao].getScore() > score) {
            posicao++;
        }

        // Move os elementos para a direita para abrir espaço para o novo elemento
        for (int i = tamanho; i > posicao; i--) {
            lista[i] = lista[i - 1];
        }

        lista[posicao] = novoGamer;
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
        if (isEmpty()) {
            return lista[0];
        }
        return null;
    }

    public void exibirLista() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(lista[i]);
            }
        }
    }

    // Método para achar a posição de um jogador com base no score
    public int achaPos(int pontos) {
        for (int i = 0; i < tamanho; i++) {
            if (lista[i].getScore() == pontos) {
                return i;
            }
        }
        return -1; 
    }
}
