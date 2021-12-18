package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        // Redirijo a la ruta /app/index que existe en otro controlador y se cambia en URL
         return "redirect:/app/index";

        //Redirijo a google
       // return "redirect:https://www.google.es";

        //Redirijo a la ruta /app/index que existe en otro controlador pero no cambia en URL
       // ideal para implementar página de inicio.
        // forward ejecuta el RequestDispatcher.forward()
        // return "forward:/app/index";

    }
}
