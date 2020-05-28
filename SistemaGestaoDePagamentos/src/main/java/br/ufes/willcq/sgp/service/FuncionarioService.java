package br.ufes.willcq.sgp.service;

import org.springframework.validation.annotation.Validated;

import br.ufes.willcq.sgp.model.Funcionario;

@Validated
public interface FuncionarioService {
	
	public Iterable<Funcionario> getAllFuncionarios();
	
	public Funcionario getFuncionario(long id);
	
	public Funcionario save(Funcionario funcionario);
	
}