package br.edu.iftm.entrega1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
    @RequestMapping("/home.html")
    String inicio(){
        return "home";
    }

    @RequestMapping("/sobre.html")
    String sobre(){
        return "sobre";
    }

    @RequestMapping("/adote.html")
    String adote(){
        return "adote";
    }

    @RequestMapping("/contato.html")
    String contato(){
        return "contato";
    }

    @RequestMapping("/apoio.html")
    String apoio(){
        return "apoio";
    }

    @RequestMapping("/cadAdocao.html")
    String pagAdocao(){
        return "cadAdocao";
    }

    @RequestMapping("/login.html")
    String login(){
        return "login";
    }

    @RequestMapping("/cadAnimais.html")
    String cadAnimais(){
        return "cadAnimais";
    }

    @RequestMapping("/cadVoluntario.html")
    String cadVoluntario(){
        return "cadVoluntario";
    }
}