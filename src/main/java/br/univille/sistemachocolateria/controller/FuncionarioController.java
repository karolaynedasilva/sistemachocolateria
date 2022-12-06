package br.univille.sistemachocolateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

import javax.validation.Valid;

import br.univille.sistemachocolateria.entity.Funcionario;
import br.univille.sistemachocolateria.entity.UF;
import br.univille.sistemachocolateria.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ModelAndView index() {
        var listaFuncionarios = service.getAll();
        return new ModelAndView("funcionario/index", "listaFuncionarios", listaFuncionarios);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var funcionario = new Funcionario();
        var listaFuncionarios = service.getAll();
        var listaUfs = UF.values();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("funcionario", funcionario);
        dados.put("listaFuncionarios", listaFuncionarios);
        dados.put("ufs", listaUfs);
        return new ModelAndView("funcionario/form", dados);
    }

    @PostMapping(params = "form")

    public ModelAndView save(@Valid Funcionario funcionario, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            var listaFuncionarios = service.getAll();
            HashMap<String, Object> dados = new HashMap<>();
            dados.put("funcionario", funcionario);
            dados.put("listaFuncionarios", listaFuncionarios);
            return new ModelAndView("funcionario/form", dados);
        }
        service.save(funcionario);
        return new ModelAndView("redirect:/funcionarios");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id) {
        var funcionario = service.findById(id);
        var listaFuncionarios = service.getAll();
        var listaUfs = UF.values();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("funcionario", funcionario);
        dados.put("listaFuncionarios", listaFuncionarios);
        dados.put("ufs", listaUfs);
        return new ModelAndView("funcionario/form", dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id) {
        service.delete(id);
        return new ModelAndView("redirect:/funcionarios");
    }
}
