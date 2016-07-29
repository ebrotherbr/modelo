package br.com.ebrother.modelo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.ebrother.poc.model.EntidadeBase;

@Entity
@Table(name = "contato")
public class Contato extends EntidadeBase<Long> {

	private static final long serialVersionUID = 43350555499941593L;

	@Id
	@Column
	private Long id;

	@Column
	private String nome;

	@Column
	private String email;

	@Override
	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

}
