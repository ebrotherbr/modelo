package br.com.ebrother.modelo.data.impl;

import org.springframework.stereotype.Repository;

import br.com.ebrother.modelo.model.Categoria;
import br.com.ebrother.modelo.model.Contato;
import br.com.ebrother.poc.persistence.DAOBase;

@Repository
public class CategoriaDAO extends DAOBase<Contato, Long> {

	public Categoria obter(final Class<Categoria> class1, final Long valueOf) {
		return this.getEntityManager().find(Categoria.class, valueOf);
	}

	// @Autowired
	// EntityManager entityManager;
	//
	// public Categoria obter(final Long categoriaId) {
	// return this.entityManager.find(Categoria.class, categoriaId);
	// }

}
