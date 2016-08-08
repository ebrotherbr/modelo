package br.com.ebrother.modelo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.ebrother.poc.model.EntidadeBase;

@Entity
@Table(name = "categoria")
public class Categoria extends EntidadeBase<Long> {

	private static final long serialVersionUID = 3170952206643592419L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column
	private String nome;

	@Column
	private String descricao;

	@OneToMany(mappedBy = "categoria")
	private final List<Produto> produtos = new ArrayList<>();

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

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProdutos() {
		return this.produtos;
	}

}
