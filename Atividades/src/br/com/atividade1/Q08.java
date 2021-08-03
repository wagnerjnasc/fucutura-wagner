package br.com.atividade1;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		int n1, n2, cont;

		System.out.println("Diga um número: ");
		n1 = tecl.nextInt();
		System.out.println("Diga um número maior que o anterior: ");
		n2 = tecl.nextInt();

		System.out.println();

		cont = (n1 + 1);
		while (cont < n2) {
			System.out.println(cont);
			cont++;
		}

	}
}
