package br.univille.sistemachocolateria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.sistemachocolateria.entity.Franquiado;

@Repository
public interface FranquiadoRepository extends JpaRepository<Franquiado,Long>{
    
}
