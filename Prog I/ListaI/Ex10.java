import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio (em cm): ");
        double raio = sc.nextDouble();
        
        System.out.print("Digite o valor da altura (em cm): ");
        double altura = sc.nextDouble();
        
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        
        System.out.printf("O volume da embalagem cilíndrica é: %.2f cm³\n", volume);
        
    }
}

