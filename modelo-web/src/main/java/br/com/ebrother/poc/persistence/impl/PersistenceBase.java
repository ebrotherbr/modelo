package br.com.ebrother.poc.persistence.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ebrother.poc.model.EntidadeBase;
import br.com.ebrother.poc.persistence.Persistence;

public abstract class PersistenceBase<P extends Serializable, T extends EntidadeBase<P>> implements Persistence<P, T> {

	@Autowired
	EntityManager entityManager;

	protected EntityManager getEntityManager() {
		return this.entityManager;
	}

	@Override
	public T obter(final Class<T> tipo, final P id) {
		return this.getEntityManager().find(tipo, id);
	}

	@Override
	public List<T> listar(final Class<T> tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T gravar(final T objeto) {
		if (objeto.getId() == null) {
			this.getEntityManager().persist(objeto);
			return objeto;
		}
		return this.getEntityManager().merge(objeto);
	}

	@Override
	public void excluir(final Class<T> tipo, final P id) {
		final T objeto = this.obter(tipo, id);
		this.excluir(objeto);
	}

	@Override
	public void excluir(final T objeto) {
		this.getEntityManager().remove(objeto);
	}

}
