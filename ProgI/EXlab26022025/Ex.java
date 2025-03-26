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
		
	sc.close();
	}
}

/**
 * Imagine que você foi contratado para desenvolver um sistema de análise de engajamento para uma rede social,
 * onde os usuários interagem curtindo as publicações. 
 * Neste exercício, seu programa deverá solicitar ao usuário o número de publicações que ele deseja analisar. 
 * Em seguida, para cada publicação, o programa pedirá que o usuário informe quantas curtidas ela recebeu. 
 * Para cada publicação, verificar se o número de curtidas é igual ou superior a 100. Caso seja, 
 * o programa deve exibir a mensagem "Publicação popular!". Se não, exibir a mensagem "Publicação com poucas curtidas.
 * ". Ao final, o sistema deve apresentar ao usuário a média de curtidas das publicações analisadas, 
 * além de informar o total de publicações processadas.
 */