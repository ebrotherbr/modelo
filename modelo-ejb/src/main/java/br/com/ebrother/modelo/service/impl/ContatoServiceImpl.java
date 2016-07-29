package br.com.ebrother.modelo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.data.impl.ContatoDAO;
import br.com.ebrother.modelo.dto.ContatoDTO;
import br.com.ebrother.modelo.model.Contato;
import br.com.ebrother.modelo.service.ContatoService;

@Service
@Transactional
public class ContatoServiceImpl implements ContatoService {

	@Autowired
	private ContatoDAO contatoDAO;

	// @Autowired
	// public ContatoServiceImpl(final ContatoDAO contatoDAO) {
	// this.contatoDAO = contatoDAO;
	// }

	@Override
	public ContatoDTO obterContato(final String contatoId) {

		final Contato contato = this.contatoDAO.obter(Long.valueOf(contatoId));

		final ContatoDTO contato2 = new ContatoDTO();
		contato2.setNome(contato.getNome());
		contato2.setEmail(contato.getEmail());
		return contato2;
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
