package src.main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SupabaseConnection {
    private static final String URL = "jdbc:postgresql://db.wiibbznyohtdkcwwvepu.supabase.co:5432/postgres?user=postgres&password=[Lab03AnaBob1234]";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Lab03AnaBob1234"; // Substitua pela senha real


    public static void main(String[] args) {
        try {
            // Carregar o driver do PostgreSQL (pode não ser necessário nas versões recentes)
            Class.forName("org.postgresql.Driver");

            // Estabelecendo a conexão
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado ao Supabase com sucesso!");

            // Lendo a entrada do usuário para inserir um novo nome
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um nome para inserir no banco de dados: ");
            String nomeDigitado = scanner.nextLine();

            // Inserindo o nome no banco
            Statement stmt = conn.createStatement();
            String sqlInsert = "INSERT INTO nomes (nome) VALUES ('" + nomeDigitado + "')";
            int rowsAffected = stmt.executeUpdate(sqlInsert);
            if (rowsAffected > 0) {
                System.out.println("Nome inserido com sucesso!");
            } else {
                System.out.println("Erro ao inserir o nome.");
            }

            // Consulta para exibir todos os nomes cadastrados
            ResultSet rs = stmt.executeQuery("SELECT * FROM nomes");
            System.out.println("Lista de nomes no banco de dados:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " - Nome: " + rs.getString("nome"));
            }

            // Fechando as conexões
            rs.close();
            stmt.close();
            conn.close();
            scanner.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        }
    }
}
