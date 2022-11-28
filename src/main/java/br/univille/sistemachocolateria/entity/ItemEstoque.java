package br.univille.sistemachocolateria.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ItemEstoque {
    private int qtd_produto;
    @ManyToOne
    private Produto produto;

}
