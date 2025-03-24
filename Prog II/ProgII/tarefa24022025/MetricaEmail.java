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