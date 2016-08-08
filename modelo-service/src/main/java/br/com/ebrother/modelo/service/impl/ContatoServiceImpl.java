package br.com.ebrother.modelo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.converter.ContatoConverter;
import br.com.ebrother.modelo.data.impl.ContatoDAO;
import br.com.ebrother.modelo.dto.ContatoDTO;
import br.com.ebrother.modelo.model.Contato;
import br.com.ebrother.modelo.service.ContatoService;
import br.com.ebrother.poc.service.ServiceBase;

@Service
@Transactional
public class ContatoServiceImpl extends ServiceBase implements ContatoService {

	@Autowired
	private ContatoDAO contatoDAO;

	@Autowired
	private ContatoConverter contatoConverter;

	@Override
	public ContatoDTO obterContato(final Long contatoId) {
		final Contato contato = this.contatoDAO.obter(contatoId);
		return this.contatoConverter.converterParaDTO(contato);
	}

	@Override
	public List<ContatoDTO> listarContatos() {
		final List<Contato> contatos = this.contatoDAO.listar();
		return this.contatoConverter.converterParaListaDTO(contatos);
	}

}
