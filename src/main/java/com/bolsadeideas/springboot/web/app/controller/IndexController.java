package com.bolsadeideas.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	
	@GetMapping({"/index", "/","", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Fabio Martin");
		usuario.setApellido("Aoad");
		usuario.setEmail("fabioaoad@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del Usuario: " .concat(usuario.getNombre()));
		return "perfil";
	}
	
	
	
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios: ");

		return "listar";
	}


	// Paso datos a la vista usando ModelAttribute()
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Fabio", "Aoad", "fabioaoad@gmail.com"),
				new Usuario("Maria", "Perez", "maria@gmail.com"),
				new Usuario("Paula", "Sanchez", "paula@gmail.com"),
				new Usuario("Andres", "Diaz", "andres@gmail.com"));
		return  usuarios;
	}
	
	
}
