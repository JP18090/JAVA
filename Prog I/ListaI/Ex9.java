import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = {200, 100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.print("Digite o preço do produto: R$ ");
        double preco = sc.nextDouble();
        System.out.print("Digite o valor pago pelo cliente: R$ ");
        double pago = sc.nextDouble();

        if (pago < preco) {
            System.out.println("Valor insuficiente para a compra.");
        } else {
            double troco = pago - preco;
            System.out.printf("Troco a ser devolvido: R$ %.2f\n", troco);

            int trocoCentavos = (int) Math.round(troco * 100);

            System.out.println("Notas a serem entregues:");
            for (int nota : notas) {
                int quantidade = trocoCentavos / (nota * 100);
                if (quantidade > 0) {
                    System.out.println(quantidade + " nota(s) de R$ " + nota);
                    trocoCentavos %= (nota * 100);
                }
            }

            System.out.println("Moedas a serem entregues:");
            for (int moeda : moedas) {
                int quantidade = trocoCentavos / moeda;
                if (quantidade > 0) {
                    System.out.println(quantidade + " moeda(s) de " + (moeda / 100.0) + " centavos");
                    trocoCentavos %= moeda;
                }
            }
        }
        
    }
}

