package school;

public abstract class Pessoa {

	private static int nome;
	private String cpf;
	private Enderešo enderešo = new Enderešo();

	public static int getNome() {
		return nome;
	}

	public static void setNome(int nome) {
		Pessoa.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Enderešo getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(Enderešo enderešo) {
		this.enderešo = enderešo;
	}

	public static void main(String[] args) {
		System.out.println(nome);
	}

}
