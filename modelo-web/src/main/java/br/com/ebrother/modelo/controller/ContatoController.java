package br.com.ebrother.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebrother.modelo.dto.ContatoDTO;
import br.com.ebrother.modelo.service.ContatoService;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

	@Autowired
	private ContatoService servico;

	@RequestMapping("/teste")
	public String testar() {
		return "Funcionando!";
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<ContatoDTO> listarContatos() {
		return this.servico.listarContatos();
	}

	@RequestMapping(path = "/{contatoId}", method = RequestMethod.GET)
	public ContatoDTO obterContato(@PathVariable final String contatoId) {
		return this.servico.obterContato(contatoId);
	}

}
