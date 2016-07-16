package br.com.ebrother.modelo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContatoController {

	@RequestMapping("/contato")
	public String obterContato() {
		return "Hello world!";
	}

}
