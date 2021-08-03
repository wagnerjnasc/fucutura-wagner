package br.com.atividade1;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Wagner";
		int idade = 30;
		double altura = 1.75, peso = 98.50, imc;

		System.out.println();

		if (idade >= 18) {
			System.out.println("Olá " + nome + ", você já é maior idade.");
		} else {
			System.out.println("Olá " + nome + ", você ainda é menor idade.");

		}
		imc = peso / (altura * altura);
		System.out.println();

		if (imc == 24.69) {
			System.out.println(nome + " você estar no peso ideal.");
		} else if (imc > 24.69) {
			System.out.println(nome + " você estar acima do peso ideal.");
		} else {
			System.out.println(nome + ", você estar abaixo do peso ideal.");
		}
	}
}