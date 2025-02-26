
public class abstractClaas {
    public static void main(String[] args) {
        MetricaRedesSociais campanha1 = new MetricaRedesSociais("Promoção de Natal", 120, 45, 30);
        MetricaEmail campanha2 = new MetricaEmail("Newsletter Black Friday", 35.2, 12.5);

        campanha1.exibirMetrica();
        System.out.println();
        campanha2.exibirMetrica();
    }
}
// Para gerar o javaDoc --> javadoc -d ./docs -sourcepath ./src 