package br.com.atividade1;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecl = new Scanner(System.in);
		String nome, respIdade, respPeso;
		int idade;
		double altura, peso, imc;

		System.out.println("================================");
		System.out.println(" C A L C U L A D O R A - I M C ");
		System.out.println("================================");
		System.out.println("Diga seu nome: ");
		nome = tecl.next();
		System.out.println("Diga sua idade: ");
		idade = tecl.nextInt();
		System.out.println("Diga sua peso: ");
		peso = tecl.nextDouble();
		System.out.println("Diga sua altura: ");
		altura = tecl.nextDouble();

		System.out.println();

		if (idade >= 18) {
			respIdade = " voc� j� � maior idade ";
		} else {
			respIdade = " voc� ainda � menor idade ";

		}
		imc = peso / (altura * altura);
		System.out.println();

		if (imc == 24.69) {
			respPeso = " voc� estar no peso ideal.";
		} else if (imc > 24.69) {
			respPeso = " voc� estar acima do peso ideal.";
		} else {
			respPeso = " voc� estar abaixo do peso ideal.";
		}
		System.out.println("Ol� " + nome + "," + respIdade + "e" + respPeso);
	}

}
