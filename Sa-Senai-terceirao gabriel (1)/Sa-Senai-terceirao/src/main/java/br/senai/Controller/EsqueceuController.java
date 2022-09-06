package br.senai.Controller;

import br.senai.model.Esqueceu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EsqueceuController {

    @GetMapping("/")
    public String esqueceu(Model model){
        model.addAttribute("esqueceu", new Esqueceu());
        return "Esqueceu/id";
    }
}


