package br.com.atividade1;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecl = new Scanner(System.in);
		String nome;
		double altura, peso, imc;
		int sexo;

		System.out.println("================================");
		System.out.println(" C A L C U L A D O R A - I M C ");
		System.out.println("================================");
		System.out.println("Diga seu nome: ");
		nome = tecl.next();
		System.out.println("Diga sua peso: ");
		peso = tecl.nextDouble();
		System.out.println("Diga sua altura: ");
		altura = tecl.nextDouble();
		System.out.println();
		System.out.println("Diga seu sexo:");
		System.out.println(" 1 - Feminino ");
		System.out.println(" 2 - Masculino ");
		sexo = tecl.nextInt();
		System.out.println();

		imc = peso / (altura * altura);
		System.out.println();

		switch (sexo) {
		case 1:
			if (imc < 19.1) {
				System.out.println(nome + ", você estar abaixo do peso ideal.");
			} else if (imc >= 19.1 || imc <= 25.8) {
				System.out.println(nome + ", você estar no peso ideal.");
			} else if (imc > 25.8 || imc <= 27.3) {
				System.out.println(nome + " você estar marginalmente acima do peso");
			} else if (imc > 27.3 || imc <= 32.3) {
				System.out.println(nome + ", você estar acima do peso ideal");
			} else if (imc > 32.3) {
				System.out.println(nome + ", você estar obeso.");
			}
			break;
		case 2:
			if (imc < 20.7) {
				System.out.println(nome + ", você estar abaixo do peso ideal.");
			} else if (imc >= 20.7 || imc <= 26.4) {
				System.out.println(nome + ", você estar no peso ideal.");
			} else if (imc > 26.4 || imc <= 27.8) {
				System.out.println(nome + ", você estar marginalmente acima do peso");
			} else if (imc > 27.8 || imc <= 31.1) {
				System.out.println(nome + ", você estar acima do peso ideal");
			} else if (imc > 31.1) {
				System.out.println(nome + ", você estar obeso.");
			}
			break;
		default:
			System.out.println("Dados inválidos.");
			break;
		}

	}

}
