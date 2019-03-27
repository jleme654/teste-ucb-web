package helper;

import java.sql.Timestamp;
import java.util.ArrayList;

import enums.TipoPessoaEnum;
import vo.ContaVO;
import vo.PFisicaVO;
import vo.PJuridicaVO;
import vo.PessoaVO;

public class HelperUtils {
	
	public static Timestamp hoje = new Timestamp(System.currentTimeMillis());
	
	public static ArrayList<ContaVO> getAllContas(){
		ArrayList<PessoaVO> lista = new ArrayList<>();
    	//pessoa juridica
    	PJuridicaVO p = new PJuridicaVO();
    	p.setNome("PESSOA JURIDICA 1");
    	p.setCpfCnpj("52.503.233/0001-00");
    	p.setRazaoSocial("razao social");
    	lista.add(p);
    	
    	//pessoa fisica
    	PFisicaVO p2 = new PFisicaVO();
    	p2.setNome("PESSOA FISICA 1");
    	p2.setCpfCnpj("879.186.929-34");
    	p2.setDataNascimento(hoje);
    	
    	lista.add(p2);
		
    	//contas
		ArrayList<ContaVO> contas = new ArrayList<>();
		ContaVO c = new ContaVO();
		c.setTipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA.getTipo());
		c.setPessoa(p);
		c.setdataCriacao(hoje);

		ContaVO c2 = new ContaVO();
		c2.setTipoPessoa(TipoPessoaEnum.PESSOA_FISICA.getTipo());
		c2.setPessoa(p2);
		c2.setdataCriacao(hoje);
		
		contas.add(c);
		contas.add(c2);
		return contas;
	}

}
