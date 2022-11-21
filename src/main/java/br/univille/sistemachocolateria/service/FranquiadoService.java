package br.univille.sistemachocolateria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.sistemachocolateria.entity.Franquiado;

@Service
public interface FranquiadoService {
    List<Franquiado> getAll();
    Franquiado save(Franquiado franquiado);
    Franquiado findById(long id);
    void delete(long id);
}
