package br.com.atividade1;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		int n1, n2, soma, multi;

		System.out.println("Diga o primeiro valor: ");
		n1 = tecl.nextInt();
		System.out.println("Diga o segundo valor: ");
		n2 = tecl.nextInt();

		soma = n1 + n2;
		multi = n1 * n2;

		System.out.println("A soma dos dois valores � " +soma+";");
		System.out.println();
		System.out.println("A multiplica��o dos dois valores � " +multi+";");
		System.out.println();

		if (soma == multi) {
			System.out.println("A soma � igual a multiplica��o.");
		} else {
			System.out.println("A soma � diferente da multiplica��o.");

		}

	}
}