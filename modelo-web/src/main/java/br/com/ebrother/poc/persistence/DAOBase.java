package br.com.ebrother.poc.persistence;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import br.com.ebrother.poc.model.EntidadeBase;
import br.com.ebrother.poc.persistence.impl.PersistenceBase;

public class DAOBase<T extends EntidadeBase<PK>, PK extends Serializable> extends PersistenceBase<PK, T> {

	@SuppressWarnings("unchecked")
	protected Class<T> getEntityClass() {
		return (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	protected DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(this.getEntityClass());
	}

	protected Criteria createCriteria() {
		final DetachedCriteria detachedCriteria = this.createDetachedCriteria();
		return detachedCriteria.getExecutableCriteria((Session) this.getEntityManager().getDelegate());
	}

	public T obter(final PK id) {
		return super.obter(this.getEntityClass(), id);
	}

	public List<T> listar() {
		return super.listar(this.getEntityClass());
	}

	public void excluir(final PK id) {
		super.excluir(this.getEntityClass(), id);
	}

}
