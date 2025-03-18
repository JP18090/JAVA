package Teoria18032025;
import java.io.*;   // Importando o arquivo

public class Main {
    public static void main(String[] args) throws Exception {
         // Criando o vetor
        Vetor lista = new Vetor(10);
        
        // Importando o arquivo
        FileReader arq = new FileReader("produtos.txt");
        BufferedReader br = new BufferedReader(arq);
        String linha = null;
        linha = br.readLine();  // Trazendo o conteúdo da primeira linha e guardando na var linha
        int contador = 0;
        
        // Transferir a linha para dentro do Vetor
        while (linha!=null){
            String[] dados = linha.split(";");    // Ta separando cada dado e ignorando a virgula
            Produto p = new Produto();
            
            // Adicionando cada parte do objeto Produto (todo produto tem codigo, descricao, preco e qtd)
            p.codigo = Integer.parseInt(dados[0]);    // p.codigo ta em primeiro lugar, então devemos pegar a primeira posicao
            p.descricao = dados[1]; // Comparando String com String por isso nao precisa de conversao de tipo
            p.precoUnit = Double.parseDouble(dados[2]); 
            p.qntdEstoque = Integer.parseInt(dados[3]);
            
            // Adicionando no meu vetor a primeira linha (p) na posicao 0
            lista.add(contador,p);
            linha = br.readLine();
            contador++;
        }
        lista.show();
    }
}