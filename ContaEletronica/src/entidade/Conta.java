package entidade;

public class Conta {
	//Atributos da Conta

		private int numero;
		private String dono;
		private double saldo;
		private double limite;

	//Construtores da Conta
		public Conta() {
			
		}

		public Conta(int numero, String dono, double saldo, double limite) {
			this.numero = numero;
			this.dono = dono;
			this.saldo = saldo;
			this.limite = limite;
		}
	// Metodos da Conta



	//Metodos get set

		public int getNumero() {// mostra valor na variavel
			return this.numero;
		}

		public void setNumero(int numero) {// recebe valor da variavel
			this.numero = numero;
		}

		public String getDono() {
			return this.dono;
		}

		public void setDono(String dono) {
			this.dono = dono;
		}

		public double getSaldo() {
			return this.saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getLimite() {
			return this.limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}

		@Override
		public String toString() {
			return "numero= " + numero + ", dono= " + dono + ", saldo= " + saldo + ", limite= " + limite + ".";
		}

	}

