package com.desafio.fluxocaixa.lancamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.fluxocaixa.lancamento.model.LancamentoCaixa;

public interface LancamentoCaixaRepository extends JpaRepository<LancamentoCaixa, Long>{

}
