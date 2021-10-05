package br.edu.iftm.entrega1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
    @RequestMapping("/")
    String inicio(){
        System.out.println("No controlador!");
        return "home";
    }
}