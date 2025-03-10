
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanho = 160000;
        int[] vetorQuickSort = new int[tamanho];
        int[] vetorBubbleSort = new int[tamanho];
        int[] vetorInsertionSort = new int[tamanho];

        // Gerando os vetores
        geraVetor(vetorQuickSort);
        System.arraycopy(vetorQuickSort, 0, vetorBubbleSort, 0, tamanho);
        System.arraycopy(vetorQuickSort, 0, vetorInsertionSort, 0, tamanho);

        // QuickSort
        long inicio = System.nanoTime();
        quickSort(vetorQuickSort, 0, vetorQuickSort.length - 1);
        long fim = System.nanoTime();
        exibeTempo("QuickSort", inicio, fim);

        // Bubble Sort
        
        inicio = System.nanoTime();
        bubbleSort(vetorBubbleSort);
        fim = System.nanoTime();
        exibeTempo("Bubble Sort", inicio, fim);
        

        // Insertion Sort (Descomente para testar, mas é lento para vetores grandes)
        
        inicio = System.nanoTime();
        insertionSort(vetorInsertionSort);
        fim = System.nanoTime();
        exibeTempo("Insertion Sort", inicio, fim);
        

        // Exibe os primeiros 20 elementos do vetor ordenado
        exibeVetor(vetorQuickSort, 20);
    }

    static void geraVetor(int[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(1000000); // Gera números de 0 a 999999
        }
        System.out.println("Vetor gerado!");
    }

    static void quickSort(int[] vetor, int ini, int fim) {
        if (ini < fim) {
            int pivoIndex = separa(vetor, ini, fim);
            quickSort(vetor, ini, pivoIndex - 1);
            quickSort(vetor, pivoIndex + 1, fim);
        }
    }

    static int separa(int[] vetor, int ini, int fim) {
        int pivo = vetor[ini];
        int i = ini, j = fim;

        while (i < j) {
            while (i < j && vetor[j] >= pivo) j--;
            if (i < j) vetor[i] = vetor[j];

            while (i < j && vetor[i] <= pivo) i++;
            if (i < j) vetor[j] = vetor[i];
        }

        vetor[i] = pivo;
        return i;
    }

    static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break; // Se não houve trocas, o vetor já está ordenado
        }
    }

    static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    static void exibeVetor(int[] vetor, int quantidade) {
        System.out.println("\nPrimeiros elementos do vetor ordenado:");
        for (int i = 0; i < Math.min(vetor.length, quantidade); i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    static void exibeTempo(String metodo, long inicio, long fim) {
        double tempoExecucao = (fim - inicio) / 1000000.0;
        double tempoSegundos = tempoExecucao / 1000.0;
        System.out.println(metodo + " - Tempo de execução: " + tempoExecucao + " ms (" + tempoSegundos + " s)");
    }
}