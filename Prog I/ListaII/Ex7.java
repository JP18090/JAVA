import java.util.Scanner;

public class Ex7 {
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int mdc = calcularMDC(num1, num2);
        System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + mdc);
        
        scanner.close();
    }
}

