package entidade;

public class Pessoa {
	//Atributos

		private String nome;
		private int idade;
		private String cpf;
		private String sexo;
		private Conta conta;// como já existe uma clase Conta, usa ela como tipo de Variavel.
		private Endereco endereco;// como já existe uma clase Endereco, usa ela como tipo de Variavel.

	//Construtores

		public Pessoa() {

		}

		public Pessoa(String nome, int idade, String cpf, String sexo, Conta conta, Endereco endereco) {
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
			this.sexo = sexo;
			this.conta = conta;
			this.endereco = endereco;
		}
		
		public void imprimirPessoa() {
			System.out.println("Pessoa Nome=" + nome + ", Idade=" + idade + ", CPF=" + cpf + ", Sexo=" + sexo + "."
					+"\nConta: " + conta + "\nEndere�o: " + endereco);
		}
		
		
	//get set

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public Conta getConta() {
			return conta;
		}
		public void setConta(Conta conta) {
			this.conta = conta;
		}

		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		@Override
		public String toString() {
			return "\nPessoa Nome=" + nome + ", Idade=" + idade + ", CPF=" + cpf + ", Sexo=" + sexo + ".\nConta: " + conta
					+ "\nEndere�o: " + endereco;
		}
}
