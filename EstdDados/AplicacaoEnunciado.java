import java.util.Random;

public class AplicacaoEnunciado {
    private static int contadorOperacoes = 0;

    public static void main(String[] args) {
        int[][] A = new int[512][512];
        int[][] B = new int[512][512];
        
        preencherA(A);
        preencherB(B);
        
        int[][] C = multiplicar(A, B);
        
        exibirResultado(C);
        
        System.out.println("Número total de operações: " + contadorOperacoes);
    }

    public static void preencherA(int[][] A) {
        Random rand = new Random();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = rand.nextInt(11); 
            }
        }
    }

    public static void preencherB(int[][] B) {
        Random rand = new Random();
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = rand.nextInt(11);
                        }
        }
    }

    public static int[][] multiplicar(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    contadorOperacoes++; 
                }
            }
        }
        return C;
    }

    public static void exibirResultado(int[][] C) {
        System.out.println("Matriz Resultado C:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}