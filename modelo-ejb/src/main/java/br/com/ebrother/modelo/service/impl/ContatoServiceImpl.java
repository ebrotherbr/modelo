package br.com.ebrother.modelo.service.impl;

import org.springframework.stereotype.Service;

import br.com.ebrother.modelo.service.ContatoService;

@Service("contatoService")
public class ContatoServiceImpl implements ContatoService {

	@Override
	public String obterContato() {
		return "Retornando contato!";
	}

}
