package br.com.ebrother.modelo.service;

import java.util.List;

import br.com.ebrother.modelo.dto.ContatoDTO;

public interface ContatoService {

	public ContatoDTO obterContato(String contatoId);

	public List<ContatoDTO> listarContatos();

}
