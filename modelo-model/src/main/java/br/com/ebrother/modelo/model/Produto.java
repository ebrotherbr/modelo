package br.com.ebrother.modelo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.ebrother.poc.model.EntityBase;

@Entity
@Table(name = "produto")
public class Produto extends EntityBase<Long> {

	private static final long serialVersionUID = -5266631565312719089L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	@Column
	private String nome;

	@Column
	private String cor;

	@Column
	private Double peso;

	@Column
	private Double preco;

	@Column
	private Double altura;

	@Column
	private Double largura;

	@Column
	private Double profundidade;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

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

	public String getCor() {
		return this.cor;
	}

	public void setCor(final String cor) {
		this.cor = cor;
	}

	public Double getPeso() {
		return this.peso;
	}

	public void setPeso(final Double peso) {
		this.peso = peso;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(final Double preco) {
		this.preco = preco;
	}

	public Double getAltura() {
		return this.altura;
	}

	public void setAltura(final Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return this.largura;
	}

	public void setLargura(final Double largura) {
		this.largura = largura;
	}

	public Double getProfundidade() {
		return this.profundidade;
	}

	public void setProfundidade(final Double profundidade) {
		this.profundidade = profundidade;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(final Categoria categoria) {
		this.categoria = categoria;
	}

}
