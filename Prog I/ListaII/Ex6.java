import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        
        double S = 0.0;
        for (int i = 1, j = N; i <= N; i++, j--) {
            S += (double) i / j;
        }
        
        System.out.println("O valor de S é: " + S);
        
        scanner.close();
    }
}