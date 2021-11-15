package br.edu.iftm.entrega1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
    @RequestMapping("/home")
    String inicio(){
        return "home";
    }

    @RequestMapping("/sobre")
    String sobre(){
        return "sobre";
    }

    @RequestMapping("/adote")
    String adote(){
        return "adote";
    }

    @RequestMapping("/contato")
    String contato(){
        return "contato";
    }

    @RequestMapping("/apoio")
    String apoio(){
        return "apoio";
    }

    @RequestMapping("/cadAdocao")
    String pagAdocao(){
        return "cadAdocao";
    }

    @RequestMapping("/login")
    String login(){
        return "login";
    }

    @RequestMapping("/cadAnimais")
    String cadAnimais(){
        return "cadAnimais";
    }

    @RequestMapping("/cadVoluntario")
    String cadVoluntario(){
        return "cadVoluntario";
    }
}