package AulaClass;

import java.util.Scanner;

import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class TesteClasse {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		p.setNome("Wagner");
		pf.setNome("Guinho");
		pj.setNome("CAKE HOUSE");
		
		System.out.println(p);
		System.out.println(pf);
		System.out.println(pj);

	}

}
