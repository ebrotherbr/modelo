package br.com.ebrother.modelo.dto;

import br.com.ebrother.poc.dto.DTOBase;

public class CategoriaDTO extends DTOBase {

	private static final long serialVersionUID = 2497744646371765805L;

	private Long id;
	private String nome;
	private String descricao;

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

}
