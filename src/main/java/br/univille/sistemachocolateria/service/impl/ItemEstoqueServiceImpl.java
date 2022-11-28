package br.univille.sistemachocolateria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.sistemachocolateria.entity.Franquiado;
import br.univille.sistemachocolateria.entity.ItemEstoque;
import br.univille.sistemachocolateria.repository.FranquiadoRepository;
import br.univille.sistemachocolateria.repository.ProdutoRepository;
import br.univille.sistemachocolateria.service.ItemEstoqueService;

@Service
public class ItemEstoqueServiceImpl implements ItemEstoqueService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired FranquiadoRepository franquiadoRepository;

    @Override
    public ItemEstoque getResumo() {
        ItemEstoque home = new ItemEstoque();
        home.setQtd_produto(produtoRepository.count());
		home.setQtd_fornecedor(franquiadoRepository.count());
        return home;
    }
    
    
}
