package com.desafio.fluxocaixa.lancamento.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.desafio.fluxocaixa.lancamento.model.LancamentoCaixa;
import com.desafio.fluxocaixa.lancamento.repository.LancamentoCaixaRepository;

@Named(value = "lancamentoMB")
@ViewScoped
public class LancamentoCaixaMB {
	
	private List<LancamentoCaixa> lancamentos = new ArrayList<>();
	
	private LancamentoCaixa lancamentoCaixa;
	
	@Autowired
	private LancamentoCaixaRepository lancamentoCaixaRepo;
	
	@PostConstruct
	public List<LancamentoCaixa> listarTodos() {
		lancamentos = lancamentoCaixaRepo.findAll();
		return lancamentos;
	}
	
	public List<LancamentoCaixa> getLancamentos() {
		return lancamentos;
	}
	
	public void setLancamentos(List<LancamentoCaixa> lancamentos) {
		this.lancamentos = lancamentos;
	}
	
	public LancamentoCaixa getLancamentoCaixa() {
		return lancamentoCaixa;
	}
	
	public void setLancamentoCaixa(LancamentoCaixa lancamentoCaixa) {
		this.lancamentoCaixa = lancamentoCaixa;
	}
	
	public Integer getTamanhoDaLista() {
		return lancamentos.size();
	}
	
	public void setTamanhoDaLista(Integer size) {
        // Método criado para ser utilizado pelo primefaces
    }

}
