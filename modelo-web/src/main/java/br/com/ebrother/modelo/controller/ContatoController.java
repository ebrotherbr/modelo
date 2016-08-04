package br.com.ebrother.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<ContatoDTO>> listarContatos() {
		return new ResponseEntity<>(this.servico.listarContatos(), HttpStatus.OK);
	}

	@RequestMapping(path = "/{contatoId}", method = RequestMethod.GET)
	public ResponseEntity<ContatoDTO> obterContato(@PathVariable final String contatoId) {
		return new ResponseEntity<>(this.servico.obterContato(Long.valueOf(contatoId)), HttpStatus.OK);
	}

}
