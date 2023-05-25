package com.desafio.fluxocaixa.lancamento.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LancamentoCaixa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLancamento;

	private String tipo;
	
	private String produto;
	
	private Double valor;
	
	private Date data;
	
	public LancamentoCaixa(Long idLancamento, String tipo, String produto, Double valor, Date data) {
		this.idLancamento = idLancamento;
		this.tipo = tipo;
		this.produto = produto;
		this.valor = valor;
		this.data = data;
	}
	
	public LancamentoCaixa() {
		
	}

	public Long getIdLancamento() {
		return idLancamento;
	}
	
	public void setIdLancamento(Long idLancamento) {
		this.idLancamento = idLancamento;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
