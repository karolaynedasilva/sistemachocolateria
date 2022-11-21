package br.univille.sistemachocolateria.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.sistemachocolateria.entity.Franquiado;
import br.univille.sistemachocolateria.repository.FranquiadoRepository;
import br.univille.sistemachocolateria.service.FranquiadoService;

@Service
public class FranquiadoServiceImpl implements FranquiadoService{

    @Autowired
    private FranquiadoRepository repositorio;

    @Override
    public List<Franquiado> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Franquiado save(Franquiado franquiado) {
        return repositorio.save(franquiado);
    }

    @Override
    public Franquiado findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
           return resultado.get();
        }
        return new Franquiado();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
    }
    
}
