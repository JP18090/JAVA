package ProgI.ProjetoN1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] vetor = new int[10]; 
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inicializar o vetor com números aleatórios");
            System.out.println("2. Imprimir o vetor");
            System.out.println("3. Verificar se um determinado número está contido no vetor");
            System.out.println("4. Buscar o maior número armazenado no vetor");
            System.out.println("5. Calcular a média dos números pares armazenados no vetor");
            System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor");
            System.out.println("7. Calcular a média centralizada dos números armazenados no vetor");
            System.out.println("8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inicializarVetor(vetor, random);
                    System.out.println("Vetor inicializado com números aleatórios.");
                    break;
                case 2:
                    imprimirVetor(vetor);
                    break;
                case 3:
                    verificarNumero(vetor, sc);
                    break;
                case 4:
                    buscarMaiorNumero(vetor);
                    break;
                case 5:
                    calcularMediaPares(vetor);
                    break;
                case 6:
                    calcularPercentualImpares(vetor);
                    break;
                case 7:
                    calcularMediaCentralizada(vetor);
                    break;
                case 8:
                    verificarSoma(vetor, sc);
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 9);

        sc.close();
    }

    public static void inicializarVetor(int[] vetor, Random random) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000);
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]); 
        }
        System.out.println();
    }
    
    public static void verificarNumero(int[] vetor, Scanner sc) {
        System.out.print("Digite o número que deseja buscar no vetor: ");
        int num = sc.nextInt();
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                System.out.println("Número encontrado no índice: " + i);
                    break;
            } else {
                System.out.println("Numero digitado não encontrado!");
                    break;
            }        
            // não ta achando o vetor
        }
    }

    public static void buscarMaiorNumero(int[] vetor) {
        
    }

    public static void calcularMediaPares(int[] vetor) {
        
    }

    public static void calcularPercentualImpares(int[] vetor) {
        
    }
    public static void calcularMediaCentralizada(int[] vetor) {
    
    }
    public static void verificarSoma(int[] vetor, Scanner scanner) {
      
    }
}
