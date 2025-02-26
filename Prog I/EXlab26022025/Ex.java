import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de publicações que deseja analisar? ");
		int numDePublicacoes = sc.nextInt();
		int totalDeCurtidas = 0;
		for(int i= 0; i < numDePublicacoes; i++){
			System.out.println("Informe quantas curtidas a publicação teve? ");
			int numDeCurtidas = sc.nextInt();	
			if( numDeCurtidas >= 100){
				System.out.println("Publicação Popular");
			} else {
				System.out.println("Publicação com poucas curtidas");
			}
			totalDeCurtidas = totalDeCurtidas + numDeCurtidas; 
		}
		float mediaDeCurtidas = ( totalDeCurtidas / numDePublicacoes);
		System.out.println("A média de curtidas das publicações analisadas será de: " + mediaDeCurtidas);
		System.out.println("O total de publicações processadas foi de: " + numDePublicacoes);
	}
}