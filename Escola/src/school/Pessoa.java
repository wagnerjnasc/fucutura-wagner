package school;

public abstract class Pessoa {

	private static int nome;
	private String cpf;
	private Endere�o endere�o = new Endere�o();

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

	public Endere�o getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
	}

	public static void main(String[] args) {
		System.out.println(nome);
	}

}
