package br.com.ebrother.modelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebrother.modelo.service.ContatoService;

@RestController
public class ContatoController {

	@Autowired
	private ContatoService servico;

	@RequestMapping("/teste")
	public String obterContato() {
		return this.servico.obterContato();
	}

}
