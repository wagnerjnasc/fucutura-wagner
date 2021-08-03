package br.com.atividade1;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		int n1;

		System.out.println("Diga um número: ");
		n1 = tecl.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("Esse número é par.");
		} else {
			System.out.println("Esse número é ímpar.");
		}

	}
}