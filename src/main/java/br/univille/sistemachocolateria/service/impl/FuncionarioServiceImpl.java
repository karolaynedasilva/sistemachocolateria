package br.univille.sistemachocolateria.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.sistemachocolateria.entity.Funcionario;
import br.univille.sistemachocolateria.repository.FuncinarioRepository;
import br.univille.sistemachocolateria.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

    @Autowired
    private FuncinarioRepository repositorio;

    @Override
    public List<Funcionario> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        return repositorio.save(funcionario);
    }

    @Override
    public Funcionario findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Funcionario();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
        
    }
    
}
