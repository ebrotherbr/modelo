package br.com.ebrother.modelo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.converter.CategoriaConverter;
import br.com.ebrother.modelo.data.impl.CategoriaDAO;
import br.com.ebrother.modelo.dto.CategoriaDTO;
import br.com.ebrother.modelo.model.Categoria;
import br.com.ebrother.modelo.service.CategoriaService;
import br.com.ebrother.poc.exception.NegocioException;
import br.com.ebrother.poc.exception.util.IndicadorTipoException;
import br.com.ebrother.poc.service.ServiceBase;

@Service
public class CategoriaServiceImpl extends ServiceBase implements CategoriaService {

	@Autowired
	private CategoriaDAO categoriaDAO;

	@Autowired
	private CategoriaConverter categoriaConverter;

	@Override
	public CategoriaDTO obterCategoria(final Long categoriaId) {
		final Categoria entidade = this.categoriaDAO.obter(categoriaId);
		if (entidade == null) {
			throw new NegocioException("Funfando", IndicadorTipoException.ERRO);
		}
		return this.categoriaConverter.converterParaDTO(entidade);
	}

	@Override
	public List<CategoriaDTO> listarCategorias() {
		final List<Categoria> entidades = this.categoriaDAO.listar();
		return this.categoriaConverter.converterParaListaDTO(entidades);
	}

}
