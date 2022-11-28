package br.univille.sistemachocolateria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.sistemachocolateria.entity.Franquiado;
import br.univille.sistemachocolateria.entity.Home;
import br.univille.sistemachocolateria.repository.FranquiadoRepository;
import br.univille.sistemachocolateria.repository.ProdutoRepository;
import br.univille.sistemachocolateria.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired FranquiadoRepository franquiadoRepository;

    @Override
    public Home getResumo() {
        Home home = new Home();
        home.setQtd_produto(produtoRepository.count());
		home.setQtd_fornecedor(franquiadoRepository.count());
        return home;
    }
    
    
}
