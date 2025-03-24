package br.JP.aplicacao;

import br.JP.acervo.Livro;
import br.JP.acervo.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class ConsoleApp {

    @Autowired
    private LivroRepository livroRepository;

    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;
        do {
            try {
                System.out.println("\n=== Menu Principal ===");
                System.out.println("1. Cadastrar Livro");
                System.out.println("2. Listar Livros");
                System.out.println("3. Buscar por Autor");
                System.out.println("4. Buscar por Ano de Publicação");
                System.out.println("5. Buscar por Termo no Título");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1 -> cadastrarLivro();
                    case 2 -> listarLivros();
                    case 3 -> buscarPorAutor();
                    case 4 -> buscarPorAnoPublicacao();
                    case 5 -> buscarPorTitulo();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Certifique-se de digitar valores válidos.");
                scanner.nextLine(); // Limpar entrada inválida
                opcao = -1;
            }
        } while (opcao != 0);
    }

    private void cadastrarLivro() {
        try {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Ano de Publicação: ");
            int anoPublicacao = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Editora: ");
            String editora = scanner.nextLine();

            Livro livro = new Livro(titulo, autor, anoPublicacao, editora);
            livroRepository.save(livro);
            System.out.println("Livro cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar livro. Verifique os dados inseridos.");
            scanner.nextLine();
        }
    }

    private void listarLivros() {
        List<Livro> livros = livroRepository.findAll();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            livros.forEach(livro -> System.out.println(livro.getId() + " - " + livro.getTitulo() + " | " + livro.getAutor() + " | " + livro.getAnoPublicacao() + " | " + livro.getEditora()));
        }
    }

    private void buscarPorAutor() {
        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();
        List<Livro> livros = livroRepository.findByAutor(autor);
        exibirLivros(livros);
    }

    private void buscarPorAnoPublicacao() {
        try {
            System.out.print("Digite o ano de publicação: ");
            int ano = scanner.nextInt();
            scanner.nextLine();
            List<Livro> livros = livroRepository.findByAnoPublicacao(ano);
            exibirLivros(livros);
        } catch (Exception e) {
            System.out.println("Erro: Ano de publicação inválido.");
            scanner.nextLine();
        }
    }

    private void buscarPorTitulo() {
        System.out.print("Digite um termo do título: ");
        String termo = scanner.nextLine();
        List<Livro> livros = livroRepository.findByTituloContainingIgnoreCase(termo);
        exibirLivros(livros);
    }

    private void exibirLivros(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            livros.forEach(livro -> System.out.println(livro.getId() + " - " + livro.getTitulo() + " | " + livro.getAutor() + " | " + livro.getAnoPublicacao() + " | " + livro.getEditora()));
        }
    }
}
