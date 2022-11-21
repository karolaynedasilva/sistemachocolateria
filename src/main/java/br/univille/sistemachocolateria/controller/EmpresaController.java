package br.univille.sistemachocolateria.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.sistemachocolateria.entity.Empresa;
import br.univille.sistemachocolateria.service.EmpresaService;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @GetMapping
    public ModelAndView index(){
        var listaEmpresa = service.getAll();
        return new ModelAndView("empresa/index", "listaEmpresa", listaEmpresa);
    }
    @GetMapping("/novo")
    public ModelAndView novo(){
        var empresa = new Empresa();
        var listaEmpresa = service.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("empresa", empresa);
        dados.put("listaEmpresa", listaEmpresa);
        return new ModelAndView("empresa/form", dados);
    }
    @PostMapping(params = "form")
    public ModelAndView save(Empresa empresa){
        service.save(empresa);
        return new ModelAndView("redirect:/empresa");
    }
}
