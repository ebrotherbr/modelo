package br.com.ebrother.modelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.data.impl.CategoriaDAO;
import br.com.ebrother.modelo.dto.CategoriaDTO;
import br.com.ebrother.modelo.model.Categoria;
import br.com.ebrother.modelo.service.CategoriaService;
import br.com.ebrother.poc.service.ServiceBase;

@Service
public class CategoriaServiceImpl extends ServiceBase implements CategoriaService {

	@Autowired
	private CategoriaDAO categoriaDAO;

	@Override
	public CategoriaDTO obterCategoria(final Long categoriaId) {
		final Categoria categoria = this.categoriaDAO.obter(categoriaId);
		return this.converter(categoria, CategoriaDTO.class);
	}

	@Override
	public List<CategoriaDTO> listarCategorias() {
		// TODO Auto-generated method stub
		return null;
	}

}
