package br.univille.sistemachocolateria.controller;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.univille.sistemachocolateria.entity.Franquiado;
import br.univille.sistemachocolateria.service.FranquiadoService;

@Controller
@RequestMapping("/franquiados")
public class FranquiadoController {
    
    @Autowired
    private FranquiadoService service;

    @GetMapping
    public ModelAndView index(){
        var listaFranquiados = service.getAll();
        return new ModelAndView("franquiado/index", "listaFranquiados",listaFranquiados);
    }
    @GetMapping("/novo")
    public ModelAndView novo(){
        var franquiado = new Franquiado();
        var listaFranquiados = service.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("franquiado", franquiado);
        dados.put("listaFranquiados", listaFranquiados);
        return new ModelAndView("franquiado/form", dados);
    }
    @PostMapping(params = "form")
    public ModelAndView save(@Valid Franquiado franquiado, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            var listaFranquiados = service.getAll();
            HashMap<String,Object> dados = new HashMap<>();
            dados.put("franquiado", franquiado);
            dados.put("listaFranquiados", listaFranquiados);
            return new ModelAndView("franquiado/form", dados);
        }
        service.save(franquiado);
        return new ModelAndView("redirect:/franquiados");
    }
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var franquiado = service.findById(id);
        var listaFranquiados = service.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("franquiado", franquiado);
        dados.put("listaFranquiados", listaFranquiados);
        return new ModelAndView("franquiado/form", dados);
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/franquiados");
    }
}
