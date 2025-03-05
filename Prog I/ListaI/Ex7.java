import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int z = sc.nextInt();

        int somaQuadrado =  (x + y + z) * (x + y + z);
        System.out.println("a) a soma dos quadrados dos três números é: " + somaQuadrado);
        int quadradoSoma = x*2 + y*2 + z*2 + 2*(x*y + x*z + y*z);
        System.out.println("b) o quadrado da soma dos três númerosé: " + quadradoSoma);

    }
}
