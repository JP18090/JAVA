package br.JP.acervo.aplicação;

import org.springframework.stereotype.Component;
import br.JP.acervo.entidade.Livro;
import br.JP.acervo.Repositorio.LivroRepository;
import java.util.List;
import java.util.Scanner;

@Component
public class ConsoleApp {
    private final LivroRepository livroRepository;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleApp(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }
    
    public void iniciar() {
        while (true) {
            System.out.println("\n[Menu Principal]");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Todos os Livros");
            System.out.println("3. Buscar por Autor");
            System.out.println("4. Buscar por Ano");
            System.out.println("5. Buscar por Título");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break; 
                case 2:
                    listarLivros();
                    break; 
                case 3:
                    buscarPorAutor();
                    break; 
                case 4:
                    buscarPorAno();
                    break; 
                case 5:
                    buscarPorTitulo();
                    break; 
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrarLivro() {
        System.out.println("\n[Cadastro de Livro]");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        if (livroRepository.existsByTituloAndAutor(titulo, autor)) {
            System.out.println("Livro já cadastrado!");
            return;
        }

        Livro livro = new Livro(titulo, autor, ano, editora);
        livroRepository.save(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private void listarLivros() {
        System.out.println("\n[Listagem Completa do Acervo]");
        List<Livro> livros = livroRepository.findAll();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            livros.forEach(System.out::println);
        }
    }

    private void buscarPorAutor() {
        System.out.print("\n[Busca por Autor]\nDigite o nome do autor: ");
        String autor = scanner.nextLine();
        List<Livro> livros = livroRepository.findByAutorContainingIgnoreCase(autor);
        exibirLivrosEncontrados(livros);
    }

    private void buscarPorAno() {
        System.out.print("\n[Busca por Ano de Publicação]\nDigite o ano desejado: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); 
        List<Livro> livros = livroRepository.findByAnoPublicacao(ano);
        exibirLivrosEncontrados(livros);
    }

    private void buscarPorTitulo() {
        System.out.print("\n[Busca por Termo no Título]\nDigite o termo desejado: ");
        String termo = scanner.nextLine();
        List<Livro> livros = livroRepository.findByTituloContainingIgnoreCase(termo);
        exibirLivrosEncontrados(livros);
    }

    private void exibirLivrosEncontrados(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            livros.forEach(System.out::println);
        }
    }
}
