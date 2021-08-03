package school;

public abstract class Pessoa {

	private static int nome;
	private String cpf;
	private Endereço endereço = new Endereço();

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

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	public static void main(String[] args) {
		System.out.println(nome);
	}

}
