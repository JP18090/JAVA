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