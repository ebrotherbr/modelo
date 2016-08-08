package br.com.ebrother.modelo.converter;

import org.springframework.stereotype.Component;

import br.com.ebrother.modelo.dto.CategoriaDTO;
import br.com.ebrother.modelo.model.Categoria;
import br.com.ebrother.poc.converter.ConverterBase;

@Component
public class CategoriaConverter extends ConverterBase<Categoria, CategoriaDTO> {

	@Override
	public Categoria converterParaEntidade(final CategoriaDTO dto) {
		final Categoria entidade = new Categoria();
		entidade.setId(dto.getId());
		entidade.setNome(dto.getNome());
		entidade.setDescricao(dto.getDescricao());
		return entidade;
	}

	@Override
	public CategoriaDTO converterParaDTO(final Categoria entidade) {
		final CategoriaDTO dto = new CategoriaDTO();
		dto.setId(entidade.getId());
		dto.setDescricao(entidade.getDescricao());
		dto.setNome(entidade.getNome());
		return dto;
	}

}
