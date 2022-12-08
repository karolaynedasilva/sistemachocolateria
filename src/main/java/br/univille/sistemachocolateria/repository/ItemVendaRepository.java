package br.univille.sistemachocolateria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import br.univille.sistemachocolateria.entity.ItemVenda;

@Repository
public interface ItemVendaRepository  extends JpaRepository<ItemVenda, Long>{

    
}
