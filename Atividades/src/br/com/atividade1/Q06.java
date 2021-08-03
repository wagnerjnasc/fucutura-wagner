package br.com.atividade1;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		String nome;
		int n1, cont;

		System.out.println("Diga seu nome: ");
		nome = tecl.next();
		System.out.println("Diga um número: ");
		n1 = tecl.nextInt();
		
		System.out.println();
		
		for (cont = 1; cont <= (n1 * 2); cont++) {
			System.out.println(cont + " - " + nome);
		}
	}

}
