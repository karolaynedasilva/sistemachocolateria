package br.univille.sistemachocolateria.controller;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import br.univille.sistemachocolateria.entity.ItemVenda;
import br.univille.sistemachocolateria.entity.Venda;
import br.univille.sistemachocolateria.service.ProdutoService;
import br.univille.sistemachocolateria.service.VendaService;

@Controller
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService service;

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ModelAndView index() {
        var listaVendas = service.getAll();
        return new ModelAndView("venda/index", "listaVendas", listaVendas);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var Vendanova = new Venda();
        var listaProdutos = produtoService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("venda", Vendanova);
        dados.put("listaProdutos", listaProdutos);
        dados.put("novoItem", new ItemVenda());
        return new ModelAndView("venda/form", dados);
    }

    @PostMapping(params = "save")
    public ModelAndView save(Venda venda) {
        service.save(venda);
        return new ModelAndView("redirect:/vendas");

    }

    
    @PostMapping(params = "incitem")
    public ModelAndView incluirItem(Venda venda,
            ItemVenda novoItem) {
        venda.getListaItens().add(novoItem);

        var listaProdutos = produtoService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("venda", venda);
        dados.put("listaProdutos", listaProdutos);
        dados.put("novoItem", new ItemVenda());
        return new ModelAndView("venda/form", dados);
    }

    @PostMapping(params = "removeitem")
    public ModelAndView removerItem(@RequestParam("removeitem") int index,
            Venda venda) {
        venda.getListaItens().remove(index);

        var listaProdutos = produtoService.getAll();
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("venda", venda);
        dados.put("listaProdutos", listaProdutos);
        dados.put("novoItem", new ItemVenda());
        return new ModelAndView("venda/form", dados);
    }

}
