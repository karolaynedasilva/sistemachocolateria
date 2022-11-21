package br.univille.sistemachocolateria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.sistemachocolateria.entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Long>{
    
}
