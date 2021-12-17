package com.bolsadeideas.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
		List<Usuario> usuarios = new ArrayList<>();
		model.addAttribute("titulo", "Listado de usuarios: ");
		model.addAttribute("usuarios", usuarios);

		return "listar";
	}
	
	
	
}
