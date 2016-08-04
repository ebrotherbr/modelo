package br.com.ebrother.poc.service;

import br.com.ebrother.poc.conversor.Conversor;

public class ServiceBase {

	// @Autowired
	private Conversor conversor;

	public ServiceBase() {
		// this.conversor = Selma.builder(Conversor.class).build();
	}

	public <S, T> T converter(final S objetoOriginal, final Class<T> classeDestino) {
		return this.conversor.converter(objetoOriginal, classeDestino);
	}

}
