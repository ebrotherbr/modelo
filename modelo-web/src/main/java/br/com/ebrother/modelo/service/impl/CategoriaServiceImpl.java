package br.com.ebrother.modelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.data.impl.CategoriaDAO;
import br.com.ebrother.modelo.dto.CategoriaDTO;
import br.com.ebrother.modelo.model.Categoria;
import br.com.ebrother.modelo.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDAO categoriaDAO;

	@Override
	public CategoriaDTO obterCategoria(final String categoriaId) {
		final Categoria categoria = this.categoriaDAO.obter(Categoria.class, Long.valueOf(categoriaId));
		final CategoriaDTO categoria2 = new CategoriaDTO();
		categoria2.setId(categoria.getId());
		categoria2.setDescricao(categoria.getDescricao());
		categoria2.setNome(categoria.getNome());
		return categoria2;
	}

	@Override
	public List<CategoriaDTO> listarCategorias() {
		// TODO Auto-generated method stub
		return null;
	}

}
