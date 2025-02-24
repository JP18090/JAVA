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

// Classe abstrata base
abstract class Campanha {
    protected String nome;
    
    public Campanha(String nome) {
        this.nome = nome;
    }
    
    public abstract void exibirMetrica();
}

// Subclasse para campanhas de redes sociais (herança)
class MetricaRedesSociais extends Campanha {
    private int curtidas;
    private int compartilhamentos;
    private int comentarios;

    public MetricaRedesSociais(String nome, int curtidas, int compartilhamentos, int comentarios) {
        super(nome);
        this.curtidas = curtidas;
        this.compartilhamentos = compartilhamentos;
        this.comentarios = comentarios;
    }

    @Override
    public void exibirMetrica() {
        System.out.println("Campanha de Redes Sociais: " + nome);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Compartilhamentos: " + compartilhamentos);
        System.out.println("Comentários: " + comentarios);
    }
}

// Subclasse para campanhas de e-mail (herança)
class MetricaEmail extends Campanha {
    private double taxaAbertura;
    private double taxaCliques;

    public MetricaEmail(String nome, double taxaAbertura, double taxaCliques) {
        super(nome);
        this.taxaAbertura = taxaAbertura;
        this.taxaCliques = taxaCliques;
    }

    @Override
    public void exibirMetrica() {
        System.out.println("Campanha de E-mail: " + nome);
        System.out.println("Taxa de Abertura: " + taxaAbertura + "%");
        System.out.println("Taxa de Cliques: " + taxaCliques + "%");
    }
}

// Classe principal para testar
public class abstractClaas {
    public static void main(String[] args) {
        MetricaRedesSociais campanha1 = new MetricaRedesSociais("Promoção de Natal", 120, 45, 30);
        MetricaEmail campanha2 = new MetricaEmail("Newsletter Black Friday", 35.2, 12.5);

        campanha1.exibirMetrica();
        System.out.println();
        campanha2.exibirMetrica();
    }
}
