import java.util.Scanner;

public class Ex4 {
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
            return String.format("Hoje é %s. Faz %d minutos que comecei a aprender Java e já entendi quase %.5f%% de tudo que foi discutido até aqui.",
                    diaSemana, minutos, porcento);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String diaSemana = sc.nextLine();
        
        Comp comp = new Comp(diaSemana, 20160, 98.76543);
        System.out.println(comp);
        
        sc.close();
    }
}
