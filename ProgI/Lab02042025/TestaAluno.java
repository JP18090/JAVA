import java.utl.Scanner;
public class TestaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nome: ");
        String name = sc.nextLine();
        Aluno a1 = new Aluno(name,8,9);
        Aluno a2 = new Aluno("Pizza");

        a2.nota1 = 10; 
        a2.nota2 = 10;

        System.out.println(a1.calcularMedia());
        System.out.println(a2.calcularMedia());



    }
}
