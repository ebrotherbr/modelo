package br.com.ebrother.modelo.converter;

import org.springframework.stereotype.Component;

import br.com.ebrother.modelo.dto.ContatoDTO;
import br.com.ebrother.modelo.model.Contato;
import br.com.ebrother.poc.converter.ConverterBase;

@Component
public class ContatoConverter extends ConverterBase<Contato, ContatoDTO> {

	@Override
	public Contato converterParaEntidade(final ContatoDTO dto) {
		final Contato entidade = new Contato();
		entidade.setId(dto.getId());
		entidade.setEmail(dto.getEmail());
		entidade.setNome(dto.getNome());
		return entidade;
	}

	@Override
	public ContatoDTO converterParaDTO(final Contato entidade) {
		final ContatoDTO dto = new ContatoDTO();
		dto.setId(entidade.getId());
		dto.setEmail(entidade.getEmail());
		dto.setNome(entidade.getNome());
		return dto;
	}

}
