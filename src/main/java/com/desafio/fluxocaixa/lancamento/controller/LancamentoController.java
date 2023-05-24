package com.desafio.fluxocaixa.lancamento.controller;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.fluxocaixa.lancamento.model.LancamentoCaixa;
import com.desafio.fluxocaixa.lancamento.repository.LancamentoCaixaRepository;

@RestController
@RequestMapping("/caixa")
public class LancamentoController {
	
	@Autowired
	private LancamentoCaixaRepository lancamentoRepo;
	
	@PostMapping
	public void incluir(@RequestBody LancamentoCaixa lancamento) {
		lancamentoRepo.save(lancamento);
	}
	
	@PutMapping
	public void alterar(@RequestBody LancamentoCaixa lancamento) {
		lancamentoRepo.save(lancamento);
	}
	
	@GetMapping
	public List<LancamentoCaixa> listar() {
		return lancamentoRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		lancamentoRepo.deleteById(id);		
	}
	
	@GetMapping("/{id}")
	public Optional<LancamentoCaixa> retornaLancamento(@PathVariable Long id) {
		return lancamentoRepo.findById(id);
	}

}
