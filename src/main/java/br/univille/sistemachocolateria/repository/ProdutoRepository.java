package br.univille.sistemachocolateria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.sistemachocolateria.entity.Produto;

@Repository
public interface ProdutoRepository
        extends JpaRepository<Produto, Long> {

}
