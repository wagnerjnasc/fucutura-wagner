package teste;

import java.util.ArrayList;
import java.util.List;

import entidade.Conta;
import entidade.Endereco;
import entidade.Pessoa;

public class BancoTeste {
	public static void main(String[] args) {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

		Pessoa p = new Pessoa();

		p.setNome(" Wagner");
		p.setCpf(" 08317476413");
		p.setIdade(30);

		Conta c = new Conta();
		c.setDono(p.getNome());
		c.setNumero(78989);
		c.setLimite(1000.00);
		c.setSaldo(5000.00);

		p.setConta(c);

		Endereco end = new Endereco();
		end.setBairo("Areias");
		end.setCidade("Recife");
		end.setEstado("PE");
		end.setNumero(172);
		end.setRua("Rua Guaraci");

		p.setEndereco(end);

		listaPessoa.add(p);
		System.out.println(p);

		p.setCpf("11111111111");
		listaPessoa.add(p);

		p = new Pessoa();
		p.setCpf("22222222222");
		listaPessoa.add(p);

		p = new Pessoa();
		p.setCpf("33333333333");

		int existe;
		existe = listaPessoa.indexOf(p);

		if (existe != -1) {
			System.out.println("CPF já existe.");
		} else {
			listaPessoa.add(p);
			System.out.println("CPF cadastrado");
		}

		System.out.println(listaPessoa);
	}

}
