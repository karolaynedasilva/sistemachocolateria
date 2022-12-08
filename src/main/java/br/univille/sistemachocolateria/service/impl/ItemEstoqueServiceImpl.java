package br.univille.sistemachocolateria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.univille.sistemachocolateria.entity.ItemEstoque;
import br.univille.sistemachocolateria.repository.FranquiadoRepository;
import br.univille.sistemachocolateria.repository.FuncinarioRepository;
import br.univille.sistemachocolateria.repository.ItemVendaRepository;
import br.univille.sistemachocolateria.repository.ProdutoRepository;
import br.univille.sistemachocolateria.repository.VendaRepository;
import br.univille.sistemachocolateria.service.ItemEstoqueService;

@Service
public class ItemEstoqueServiceImpl implements ItemEstoqueService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired 
    private FranquiadoRepository franquiadoRepository;

    @Autowired
    private FuncinarioRepository funcinarioRepository;

    @Autowired
        private ItemVendaRepository vendaRepository;


    @Override
    public ItemEstoque getResumo() {
        ItemEstoque estoque = new ItemEstoque();
        estoque.setQtd_funcionario(funcinarioRepository.count());
        estoque.setQtd_produto(produtoRepository.count());
		estoque.setQtd_franquiado(franquiadoRepository.count());
        // estoque.setQtd_produto_estoque(vendaRepository.count());
        return estoque;
    }
    
    
}
