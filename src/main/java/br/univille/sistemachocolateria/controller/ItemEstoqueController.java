package br.univille.sistemachocolateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.sistemachocolateria.entity.ItemEstoque;
import br.univille.sistemachocolateria.service.ItemEstoqueService;

@Controller
@RequestMapping
public class ItemEstoqueController {
    
    @Autowired
	private ItemEstoqueService itemService;

    @GetMapping("/estoque")
    public ModelAndView index(ModelMap model){
        ItemEstoque estoque = itemService.getResumo();
        model.addAttribute(estoque);
        return new ModelAndView("estoque/index","estoque", estoque);
    }

}
