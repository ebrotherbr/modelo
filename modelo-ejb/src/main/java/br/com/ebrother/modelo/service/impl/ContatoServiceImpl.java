package br.com.ebrother.modelo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.dto.ContatoDTO;
import br.com.ebrother.modelo.service.ContatoService;

@Service("contatoService")
public class ContatoServiceImpl implements ContatoService {

	@Override
	public ContatoDTO obterContato(final String contatoId) {
		final ContatoDTO contato = new ContatoDTO();
		contato.setNome("Fulano da Silva");
		contato.setEmail("fulano@uol.com.br");
		return contato;
	}

	@Override
	public List<ContatoDTO> listarContatos() {
		final List<ContatoDTO> contatos = new ArrayList<>();
		final ContatoDTO contato = new ContatoDTO();
		contato.setNome("Fulano da Silva");
		contato.setEmail("fulano@uol.com.br");
		final ContatoDTO contato2 = new ContatoDTO();
		contato2.setNome("Beltrano Ferreira");
		contato2.setEmail("beltrano@uol.com.br");
		contatos.add(contato);
		contatos.add(contato2);
		return contatos;
	}

}
