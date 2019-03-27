package com.julio.enums;

/**
 * 
 * @author julio
 * @since 2019-03-26
 * @version 1.0.0
 * 
 */
public enum TipoPessoaEnum {

	PESSOA_FISICA(0, 'F'), PESSOA_JURIDICA(1, 'J');

	private int key;
	private char tipo;

	private TipoPessoaEnum(int key, char tipo) {
		this.key = key;
		this.tipo = tipo;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

}
