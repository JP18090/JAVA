import java.util.Scanner;

public class Ex5 {
    public static class Comp {
        private String diaSemana;
        private int minutos;
        private double porcento;

        public Comp(String diaSemana, int minutos, double porcento) {
            this.diaSemana = diaSemana;
            this.minutos = minutos;
            this.porcento = porcento;
        }

        @Override
        public String toString() {
            return String.format("Hoje é %s. Faz %.2e minutos que comecei a aprender Java e já entendi quase %.1f%% de tudo que foi discutido até aqui.",
                    diaSemana, (double) minutos, porcento);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String diaSemana = sc.nextLine();
        System.out.println("Digite a quantos minutos você começou a aprender JAVA: ");
        int minutos = sc.nextInt();
        System.out.println("Digite quantos porcento você já entendeu de JAVA: ");
        double porcento = sc.nextDouble();
        
        Comp comp = new Comp(diaSemana, minutos, porcento);
        System.out.println(comp);
        
        sc.close();
    }
}
