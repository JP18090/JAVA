
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturasMulheres = 0;
        double somaAlturasTotal = 0;
        int quantidadeMulheres = 0;
        int quantidadeTotal = 0;
        int quantidadeHomens = 0;
        
        while (true) {
            System.out.print("Digite o sexo (0 = masculino, 1 = feminino, -1 para sair): ");
            int sexo = scanner.nextInt();
            
            if (sexo == -1) break;
            
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();
            
            if (altura > maiorAltura) maiorAltura = altura;
            if (altura < menorAltura) menorAltura = altura;
            
            somaAlturasTotal += altura;
            quantidadeTotal++;
            
            if (sexo == 1) {
                somaAlturasMulheres += altura;
                quantidadeMulheres++;
            } else if (sexo == 0) {
                quantidadeHomens++;
            }
        }
        
        double mediaAlturaMulheres;
        if (quantidadeMulheres > 0) {
            mediaAlturaMulheres = somaAlturasMulheres / quantidadeMulheres;
        } else {
            mediaAlturaMulheres = 0;
        }
        
        double mediaAlturaTotal;
        if (quantidadeTotal > 0) {
            mediaAlturaTotal = somaAlturasTotal / quantidadeTotal;
        } else {
            mediaAlturaTotal = 0;
        }
        
        double percentualHomens;
        if (quantidadeTotal > 0) {
            percentualHomens = ((double) quantidadeHomens / quantidadeTotal) * 100;
        } else {
            percentualHomens = 0;
        }
        
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Média de altura da população: " + mediaAlturaTotal);
        System.out.println("Percentual de homens na população: " + percentualHomens + "%");
        
        scanner.close();
    }
}
