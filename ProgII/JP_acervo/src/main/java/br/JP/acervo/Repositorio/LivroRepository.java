package br.JP.acervo.Repositorio;

import br.JP.acervo.entidade.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByAutorIgnoreCase(String autor);
    List<Livro> findByAnoPublicacao(int anoPublicacao);
    List<Livro> findByTituloContainingIgnoreCase(String termo);
    boolean existsByTituloIgnoreCaseAndAutorIgnoreCase(String titulo, String autor);
}
