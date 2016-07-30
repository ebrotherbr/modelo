package br.com.ebrother.modelo.data.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.ebrother.modelo.model.Contato;

@Repository
public class ContatoDAO {

	@Autowired
	EntityManager entityManager;

	public Contato obter(final Long id) {
		return this.entityManager.find(Contato.class, id);
	}

}
