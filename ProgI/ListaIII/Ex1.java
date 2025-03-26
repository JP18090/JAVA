import java.util.Scanner;

    public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[10];
            int soma = 0;
            
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
            
        System.out.println("A soma de todos os números é: " + soma);
            
        scanner.close();
    }
}