package model;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	Scanner leia = new Scanner(System.in);
	private String titular;
	private float cpf;
	private double valor;
	private double saldo;

	public ContaCorrente() {
		System.out.println("Estamos processando sua solicita??o!");
		System.out.println("Nome do Titular: ");
		titular = leia.nextLine();
		System.out.println("CPF do Titular: ");
		cpf = leia.nextFloat();
		System.out.println("Valor de dep?sito inicial: (M?nimo R$ 50,00)");
		valor = leia.nextDouble();
		depositoInicial(valor);
		System.out.println("Bem Vindo(a), " + titular);
		System.out.println("Sua Conta Corrente j? est? em opera??o!");
	}

	public double sacar(double valor) {
		System.out.println("Valor do saque: ");
		valor = leia.nextDouble();
		System.out.println("Realizando Saque... " + valor);
		return saldo = saldo - valor;
	}

	public double depositar(double valor) {
		System.out.println("Valor do dep?sito: ");
		valor = leia.nextDouble();
		System.out.println("Realizando Dep?sito... " + valor);
		return saldo = saldo + valor;
	}

	public double depositoInicial(double valor) {
		return saldo = saldo + valor;
	}

	public void transferir(Conta c, double valor) {
		System.out.println("Valor da Transfer?ncia: ");
		valor = leia.nextDouble();
		System.out.println("Transferindo valor... " + valor);
		System.out.println("Saldo: " + getSaldo());
		sacar();
		c.depositar();
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
