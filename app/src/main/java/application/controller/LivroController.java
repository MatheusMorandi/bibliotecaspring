package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivroController {

    @RequestMapping("/livro")
    public String list(){

        return "WEB-INF/list.jsp";

    }

}
