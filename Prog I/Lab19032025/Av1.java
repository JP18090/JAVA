/*
 * Você foi contratado para desenvolver um sistema que auxilia na análise de preços de produtos em uma loja de calçados. 
 * Seu objetivo é criar um programa em Java que armazene os preços dos produtos da loja, sendo que a loja possui 10 produtos diferentes.
 * Após armazenar os preços, o programa deve solicitar ao usuário um valor de desconto que deve ser aplicado ao valor de todos os produtos. 
 * Por fim, apresente os valores dos novos preços.
 */

 import java.util.Scanner;

 public class Av1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        double[] produto = new double[10];
        for (int i = 0; i < produto.length; i++) {
            System.out.println("Digite o preço do produto número " + (i + 1) + ": ");
            produto[i] = sc.nextDouble();
         }
 
        System.out.println("Veja os preços cadastrados: ");
        for (int i = 0; i < produto.length; i++) {
            System.out.println("Produto " + (i + 1) + ": R$ " + produto[i]);
         }
 
        System.out.println("Informe o desconto que deseja aplicar (em %): ");
        double desconto = sc.nextDouble();
 
        System.out.println("Produtos com desconto: ");
        for (int i = 0; i < produto.length; i++) {
            double novoPreco = produto[i] - (produto[i] * desconto / 100);
            System.out.println("Produto " + (i + 1) + " com desconto: R$ " + novoPreco);
        }
    }
}
 

// Produzido por José Pedro Bitetti
