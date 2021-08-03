package entidade;

public class Endereco {
	//Atributos 

		private String rua;
		private int numero;
		private String bairo;
		private String cidade;
		private String estado;

	//Construtores
		
		public Endereco(){
			
		}

		public Endereco(String rua, int numero, String bairo, String cidade, String estado){
			this.rua = rua;
			this.numero = numero;
			this.bairo = bairo;
			this.cidade = cidade;
			this.estado = estado;
		}
	//get set
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}

		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getBairo() {
			return bairo;
		}
		public void setBairo(String bairo) {
			this.bairo = bairo;
		}
		
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}

		@Override
		public String toString() {
			return "rua= " + rua + ", numero= " + numero + ", bairo= " + bairo + ", cidade= " + cidade + ", estado= "
					+ estado + ".";
		}
		
	}

