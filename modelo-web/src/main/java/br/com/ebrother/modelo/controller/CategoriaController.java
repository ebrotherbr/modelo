package br.com.ebrother.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebrother.modelo.dto.CategoriaDTO;
import br.com.ebrother.modelo.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService servico;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CategoriaDTO>> listarCategorias() {
		return new ResponseEntity<>(this.servico.listarCategorias(), HttpStatus.OK);
	}

	@RequestMapping(path = "/{categoriaId}", method = RequestMethod.GET)
	public ResponseEntity<CategoriaDTO> obterCategoria(@PathVariable final String categoriaId) {
		return new ResponseEntity<>(this.servico.obterCategoria(Long.valueOf(categoriaId)), HttpStatus.OK);
	}

}
