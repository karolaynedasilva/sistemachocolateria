package br.univille.sistemachocolateria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.sistemachocolateria.service.HomeService;

@Controller
@RequestMapping
public class HomeController {
    
    @Autowired
	private HomeService homeService;

	// @GetMapping("/home")
	// public String home(ModelMap model) {
	// 	Home home = homeService.getResumo();
	// 	model.addAttribute(home);
	// 	return "/home";
	// }

    // @GetMapping
	// public String home(ModelMap model) {
	// 	Home home = homeService.getResumo();
	// 	model.addAttribute(home);
	// 	return "home";
	// }

    // @GetMapping
    // public ModelAndView index(ModelMap model){
    //     Home home = homeService.getResumo();
    //     model.addAttribute(home);
    //     return new ModelAndView("home/index","home",home);
    // }
    private int contador;

    @GetMapping("/home")
    public ModelAndView index(){
        contador++;
        return new ModelAndView("home/index","valor",contador);
    }

}
