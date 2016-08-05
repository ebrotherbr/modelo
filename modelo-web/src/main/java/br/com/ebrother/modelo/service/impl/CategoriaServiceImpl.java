package br.com.ebrother.modelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.converter.CategoriaConverter;
import br.com.ebrother.modelo.data.impl.CategoriaDAO;
import br.com.ebrother.modelo.dto.CategoriaDTO;
import br.com.ebrother.modelo.model.Categoria;
import br.com.ebrother.modelo.service.CategoriaService;
import br.com.ebrother.poc.service.ServiceBase;
import fr.xebia.extras.selma.Selma;

@Service
public class CategoriaServiceImpl extends ServiceBase implements CategoriaService {

	CategoriaConverter converter = Selma.builder(CategoriaConverter.class).build();

	@Autowired
	private CategoriaDAO categoriaDAO;

	@Override
	public CategoriaDTO obterCategoria(final Long categoriaId) {
		final Categoria categoria = this.categoriaDAO.obter(categoriaId);
		// final CategoriaDTO categoriaDTO = new CategoriaDTO();
		// categoriaDTO.setId(categoria.getId());
		// categoriaDTO.setDescricao(categoria.getDescricao());
		// categoriaDTO.setNome(categoria.getNome());
		// return categoriaDTO;
		return this.converter.converterParaDTO(categoria);
	}

	@Override
	public List<CategoriaDTO> listarCategorias() {
		// TODO Auto-generated method stub
		return null;
	}

}
