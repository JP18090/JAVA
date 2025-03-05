import java.util.Scanner; 

/**
	 * 8) Faça um programa que receba o custo de produção de um espetáculo teatral e o preço do ingresso
	para esse espetáculo. Esse programa deve calcular e mostrar:
	a) A quantidade de convites a serem vendidos para que o custo do espetáculo seja alcançado.
	b) A quantidade de convites vendidos para obter um lucro de 23%.
 */
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de produção do espetaculo teatral:");
		Float custoDoExpetaculo = sc.nextFloat();
		System.out.println("Digite o preço do ingresso:");
		Float valorIngresso = sc.nextFloat();

		int qntdConvites = (int) Math.ceil(custoDoExpetaculo / valorIngresso);
		int qntdConvites23 = (int) Math.ceil((custoDoExpetaculo * 1.23) / valorIngresso);
		System.out.println("A qntd de convites a serem vedidos para que o custo do espetaculo seja alcançado é de: " + qntdConvites);
		System.out.println( "A qntd de convites vendidos para obter um lucro de 23% será de: " + qntdConvites23);
	}
}