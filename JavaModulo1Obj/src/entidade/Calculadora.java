package entidade;

public class Calculadora {

	private double operandoEsquerdo;
	private double operandoDireito;
	private double resposta;

	// Construtores
	public Calculadora(double operandoEsquesrdo, double operandoDireito) {
		this.operandoEsquerdo = operandoEsquerdo;
		this.operandoDireito = operandoDireito;
	}

	public Calculadora() {

	}

	// Método
	public void somar() {
		System.out.println(operandoEsquerdo + operandoDireito);
	}

	public double somar(double operandoEsquerdo, double operandoDireito) {
		return this.resposta = operandoEsquerdo + operandoDireito;
	}

	// Get Set
	public double getOperandoEsquerdo() {
		return operandoEsquerdo;
	}

	public void setOperandoEsquerdo(double operandoEsquerdo) {
		this.operandoEsquerdo = operandoEsquerdo;
	}

	public double getOperandoDireito() {
		return operandoDireito;
	}

	public void setOperandoDireito(double operandoDireito) {
		this.operandoDireito = operandoDireito;
	}

	// ToString
	public String toString() {
		return "Calculadora: num1= " + operandoEsquerdo + " , num2= " + operandoDireito + ":";
	}
}