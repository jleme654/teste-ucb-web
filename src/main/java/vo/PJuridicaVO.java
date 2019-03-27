package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author julio
 * @since 2019-03-26
 * @version 1.0.0
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PJuridicaVO extends PessoaVO {

	private String razaoSocial;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
