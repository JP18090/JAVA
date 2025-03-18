package Teoria18032025;

public class Produto{
    int codigo;
    String descricao;
    double precoUnit;
    int qntdEstoque;
    
    Produto(){

    }
    public Produto(int codigo, String descricacao, double precoUnit, int qtdEstoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnit = precoUnit;
        this.qntdEstoque = qntdEstoque;
    }
    
    public void exibirProduto(){
        System.out.println("Código: " + codigo + " | Descricacao: " + descricao + " | precoUnit: " + precoUnit + " | QtdEstoque: " + qntdEstoque);
    }
}
