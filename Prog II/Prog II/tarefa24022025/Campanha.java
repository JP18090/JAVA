
// Classe abstrata base
abstract class Campanha {
    protected String nome;
    
    public Campanha(String nome) {
        this.nome = nome;
    }
    
    public abstract void exibirMetrica();
}

/**
 * Porque usamos classes abstratas? 
 * 
 * Usamos classes abstratas para usa-lá de base para outras classes, visto que, ela não pode ser instanciada criamos outras classes
 * mais especializada como neste caso a classe Campanha que é abstrata 
 * serve de base para as Classes MetricaRedesSociais e MetricaEmail
 */

/**
 * O que mudaria se a classe abstrata fosse uma classe concreta ? 
 * 
 * A principal dioferença é que a classe abstrata não pode ser instanciada, já a classe concreta pode ser instanciada.
 * Dito isso, teriamos que transformar a classe Campanha em concreta e implementar o metodo exibirMetrica
 */

// Classe principal para testar