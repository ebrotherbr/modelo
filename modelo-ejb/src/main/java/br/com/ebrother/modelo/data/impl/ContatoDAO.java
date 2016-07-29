package br.com.ebrother.modelo.data.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.ebrother.modelo.model.Contato;

@Repository
public class ContatoDAO {

	@PersistenceContext(unitName = "PostgresDS")
	private EntityManager entityManager;

	public Contato obter(final Long id) {
		return this.entityManager.find(Contato.class, id);
	}

}
