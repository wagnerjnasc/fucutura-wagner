package br.com.atividade1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		String letra, resp;

		System.out.println("Escreva uma letra: ");
		letra = tecl.next();
		System.out.println();

		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
				|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			resp = "vogal";
		} else
			resp = "consoante";

		System.out.println(letra+ " é uma " + resp + ".");

	}
}
