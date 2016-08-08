package br.com.ebrother.modelo.dto;

import br.com.ebrother.poc.vo.DTOBase;

public class ContatoDTO extends DTOBase {

	private static final long serialVersionUID = -6380563268440962510L;

	private String nome;
	private String email;

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
