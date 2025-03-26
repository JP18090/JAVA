package ProgI.Lab19032025;
/**
 * Atividade Avaliativa 1 mas com metodos estaticos
 */

import java.util.Scanner;

public class Main {
    // passagem de vetor por referencia 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = populaVetor(); // O nome não precisa ser o mesmo
        System.out.println("Valor do desconto: ");
        double desconto = sc.nextDouble();
        aplicaDesconto(precos, desconto);
        imprimeVetor(precos);
    }

    public static void aplicaDesconto(double[] precos, double desconto){
        for(int i = 0; i < precos.length; i++){
            precos[i] = precos[i] - (precos[i] * desconto / 100);
        }
    }

    public static double[] populaVetor() {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Digite o preço do produto número " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }
        return precos;
    }

    public static void imprimeVetor(double[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%2.f", vetor[i]);
        }
        System.out.println();
    }
}

// .length(atributo do objeto precos) usamos para percorer o vetor 
// preco[i] para guardar cada valor dentro do vetor 


