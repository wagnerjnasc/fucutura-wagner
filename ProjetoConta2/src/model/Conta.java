package model;

import java.util.Scanner;

public class Conta {

	Scanner leia = new Scanner(System.in);
	private double saldo;

	public double sacar() {
		double valor;
		System.out.println("Valor do saque: ");
		valor = leia.nextDouble();
		System.out.println("Realizando Saque... " + valor);
		return saldo = saldo - valor;
	}

	public double depositar() {
		double valor;
		System.out.println("Valor do depósito: ");
		valor = leia.nextDouble();
		System.out.println("Realizando Depósito... " + valor);
		return saldo = saldo + valor;
	}

	public void transferir(Conta c, double valor) {
		System.out.println("Valor da Transferência: ");
		valor = leia.nextDouble();
		System.out.println("Transferindo valor... " + valor);
		System.out.println("Saldo: " + getSaldo());
		sacar();
		c.depositar();
	}

	public void mostrarSaldo() {
		System.out.println("Saldo: " + getSaldo());
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
