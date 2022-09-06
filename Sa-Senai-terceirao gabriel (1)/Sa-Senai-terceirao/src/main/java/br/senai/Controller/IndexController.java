package br.senai.Controller;

import br.senai.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String login(Model model){
        model.addAttribute("usuario", new Usuario());
        return "Usuario/login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
