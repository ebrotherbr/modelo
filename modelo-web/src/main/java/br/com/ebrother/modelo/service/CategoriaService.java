package br.com.ebrother.modelo.service;

import java.util.List;

import br.com.ebrother.modelo.dto.CategoriaDTO;

public interface CategoriaService {

	public CategoriaDTO obterCategoria(Long categoriaId);

	public List<CategoriaDTO> listarCategorias();

}
