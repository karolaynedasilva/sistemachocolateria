package br.univille.sistemachocolateria.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice 
@RequestMapping
public class HomeController {
    
    private int contador;

    @GetMapping("/home")
    public ModelAndView index(){
        contador++;
        return new ModelAndView("home/index","valor",contador);
    }
}
