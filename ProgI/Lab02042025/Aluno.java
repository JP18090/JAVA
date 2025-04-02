package ProgI.Lab02042025;

public class Aluno {
    // atributos 
    public String nome; 
    public Double nota1;
    public Double nota2;

    // Cronstrutor    
    public Aluno(String nome){
        this.nome = nome;
    }
    public Aluno(String nome, Double nota1, Double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2; 
    }


    // Métodos
    public calcularMedia(){
        double soma = nota1 + nota2;
        return soma / 2; 
    }
}