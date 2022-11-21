package br.univille.sistemachocolateria.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.sistemachocolateria.entity.Empresa;
import br.univille.sistemachocolateria.repository.EmpresaRepository;
import br.univille.sistemachocolateria.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{
     
    @Autowired
    private EmpresaRepository repositorio;

    @Override
    public List<Empresa> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Empresa save(Empresa empresa) {
        return repositorio.save(empresa);
    }
    
}
