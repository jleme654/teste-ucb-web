package com.julio.vo;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author julio
 * @since 2019-03-26
 * @version 1.0.0
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContaVO {

	private Timestamp dataCriacao;
	private char tipoPessoa;
	private PessoaVO pessoa;

	public Timestamp getdataCriacao() {
		return dataCriacao;
	}

	public void setdataCriacao(Timestamp dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	
	public char getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(char tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public PessoaVO getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaVO pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "ContaVO [dataCriacao=" + dataCriacao + ", tipoPessoa=" + tipoPessoa + ", pessoa=" + pessoa + "]";
	}

}
