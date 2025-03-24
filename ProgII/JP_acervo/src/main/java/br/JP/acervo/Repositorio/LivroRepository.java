package ProgII.JP_acervo.src.main.java.br.JP.acervo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProgII.JP_acervo.src.main.java.br.JP.acervo.entidade.Livro;

import java.util.List;

@Repository  
public interface LivroRepository extends JpaRepository<Livro, Long> {
    
    List<Livro> findByAutor(String autor);
    
    List<Livro> findByAnoPublicacao(int anoPublicacao);
    
    List<Livro> findByTituloContainingIgnoreCase(String titulo);
    
    boolean existsByTituloAndAutor(String titulo, String autor);

    List<Livro> findByAutorContainingIgnoreCase(String autor);
}
