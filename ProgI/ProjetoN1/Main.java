package ProgI.ProjetoN1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] vetor = new int[10]; // Tamanho do vetor
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
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    inicializarVetor(vetor, random);
                    System.out.println("Vetor inicializado com números aleatórios.");
                    break;
                case 2:
                    imprimirVetor(vetor);
                    break;
                case 3:
                    verificarNumero(vetor, scanner);
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
                    verificarSoma(vetor, scanner);
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 9);

        scanner.close();
    }

    public static void inicializarVetor(int[] vetor, Random random) {
        
    }

    public static void imprimirVetor(int[] vetor) {
        
    }

    public static void verificarNumero(int[] vetor, Scanner scanner) {
        
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
