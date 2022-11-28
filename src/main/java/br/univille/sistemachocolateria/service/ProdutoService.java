package br.univille.sistemachocolateria.service;

import java.util.List;

import br.univille.sistemachocolateria.entity.Produto;
import br.univille.sistemachocolateria.util.PaginacaoUtil;

public interface ProdutoService {
    List<Produto> getAll();

    void save(Produto produto);

    Produto findById(long id);

    void delete(long id);

    // PaginacaoUtil<Produto> buscarPorPagina(int pagina);

}
