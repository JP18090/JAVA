import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código presente na etiqueta: ");
        int PC = sc.nextInt();
        System.out.println("Digite o preço presente na etiqueta: ");
        double PE = sc.nextDouble(); 

        switch (PC) {
            case 1:
                double precoComDesconto = PE * 0.9; 
                System.out.println("À vista em dinheiro ou cheque, você terá 10% de desconto.");
                System.out.println("O preço do produto de " + PE + " irá sair por " + precoComDesconto);
                break;
            case 2:
                System.out.println("À vista no cartão de crédito, você terá 5% de desconto.");
                double precoCartao = PE * 0.95;
                System.out.println("O preço final será " + precoCartao);
                break;
            case 3:
                System.out.println("Em duas vezes, preço normal de etiqueta sem juros.");
                System.out.println("O preço final será " + PE);
                break;
            case 4:
                System.out.println("Em três vezes ou mais, acréscimo de 10% sobre o preço.");
                double precoParcelado = PE * 1.1;
                System.out.println("O preço final será " + precoParcelado);
                break;
            default:
                System.out.println("Código inválido! Tente novamente.");
                break;
        }

    }
}
