package br.univille.sistemachocolateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;

import br.univille.sistemachocolateria.entity.Funcionario;
import br.univille.sistemachocolateria.service.FuncionarioService;

@Controller
@RequestMapping
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService service;

    @GetMapping("/funcionarios")
    public ModelAndView index(){
        var listaFuncionarios = service.getAll();
        return new ModelAndView("funcionario/index","listaFuncionarios",listaFuncionarios);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var funcionario = new Funcionario();
        var listaFuncionarios = service.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("funcionario", funcionario);
        dados.put("listaFuncionarios", listaFuncionarios);
        return new ModelAndView("funcionario/form", dados);
    }
    @PostMapping(params = "form")
    public ModelAndView save(Funcionario funcionario){
        service.save(funcionario);
        return new ModelAndView("redirect:/franquiados");
    }
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var funcionario = service.findById(id);
        var listaFuncionarios = service.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("franquiado", funcionario);
        dados.put("listaFuncionarios", listaFuncionarios);
        return new ModelAndView("franquiado/form", dados);
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/franquiados");
    }
}

