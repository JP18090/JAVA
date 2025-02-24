package PredioEX8;

public class Predio {
    public static void main(String[] args) {
        int[][] predio = new int[10][8];

        // Preenchimento da Matriz
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                predio[i][j] = (int) (Math.random() * 7); // Limitar números entre 0 e 6 como solicitado
            }
        }

        // Exibindo a Matriz
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                System.out.print(predio[i][j] + " ");
            }
            System.out.println("");
        }

        // Quantidade de apartamentos vazios (nº moradores = 0)
        int vazios = 0;
        int qntMoradores = 0;
        int maxMoradores = 0;
        int andarMaiorNumMoradores = 0;

        // Percorre cada andar e cada apartamento
        for (int i = 0; i < predio.length; i++) {
            int moradoresPorAndar = 0; // Agora a variável está corretamente declarada uma vez

            for (int j = 0; j < predio[i].length; j++) {
                if (predio[i][j] == 0) {
                    vazios++;
                }
                qntMoradores += predio[i][j];
                moradoresPorAndar += predio[i][j]; // Soma moradores por andar
            }

            // Atualiza o andar com maior número de moradores
            if (moradoresPorAndar > maxMoradores) {
                maxMoradores = moradoresPorAndar;
                andarMaiorNumMoradores = i + 1;
            }
        }

        // Prints para o levantamento do síndico
        System.out.println("Existem " + qntMoradores + " moradores nesse prédio");
        System.out.println("Existem " + vazios + " apartamentos vazios");
        System.out.println("O andar com maior número de moradores é o " + andarMaiorNumMoradores + "°");
    }
}