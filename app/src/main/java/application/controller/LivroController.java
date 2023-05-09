package application.controller;

import application.model.Livro;

import application.model.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LivroController {

    @Autowired
    private LivroRepository livroRepo;

    @RequestMapping("/livro")
    public String list(Model model){

        model.addAttribute("livros", livroRepo.findAll());

        return "WEB-INF/list.jsp";

    }

    @RequestMapping("/insert")
    public String insert(){

        return "WEB-INF/insert.jsp";

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("titulo") String titulo){

        Livro livro = new Livro();

        livro.setTitulo(titulo);

        livroRepo.save(livro);
 
        return "redirect:/livro";

    }

}
