package br.univille.sistemachocolateria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.sistemachocolateria.entity.Empresa;

@Service
public interface EmpresaService {
    List<Empresa> getAll();
    Empresa save(Empresa empresa);
}
