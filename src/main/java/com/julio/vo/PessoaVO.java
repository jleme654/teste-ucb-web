package com.julio.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * 
 * @author julio
 * @since 2019-03-26
 * @version 1.0.0
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PessoaVO {

	public String nome;
	public String cpfCnpj;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	@Override
	public String toString() {
		return "PessoaVO [nome=" + nome + ",cpfCnpj=" + cpfCnpj + "]";
	}

}
