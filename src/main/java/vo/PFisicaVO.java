package vo;

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
public class PFisicaVO extends PessoaVO {

	private Timestamp dataNascimento;

	public Timestamp getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Timestamp dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
