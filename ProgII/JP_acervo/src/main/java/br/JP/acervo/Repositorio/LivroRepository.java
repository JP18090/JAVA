package br.JP.acervo.Repositorio;

import br.JP.acervo.entidade.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    boolean existsByTituloAndAutor(String titulo, String autor);
    List<Livro> findByAutorContainingIgnoreCase(String autor);
    List<Livro> findByAnoPublicacao(int ano);
    List<Livro> findByTituloContainingIgnoreCase(String titulo);
}
