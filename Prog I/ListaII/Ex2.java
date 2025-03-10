import java.util.Scanner; 

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Vestuário");
                break;
            case 7: 
                System.out.println("Higiene pessoal");
                break;
            case 8:
            case 9: 
            case 10: 
                System.out.println("Utensílios domésticos");
                break;
            default:
                System.out.println("Categoria Invalida");
                break;
        }

    }
}


/**
* A tributação de impostos aplica alíquotas diferentes para os produtos, de acordo com a sua natureza fabril.
Implemente um programa que leia o código de um determinado produto e mostre a sua
classificação categórica do fisco, segundo a tabela dada ao lado:
*/