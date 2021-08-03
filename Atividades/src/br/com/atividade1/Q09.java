package br.com.atividade1;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		int fila, idade, cont, idMaior = 0, idMenor = 0;

		System.out.println("Quantas pessoas tem na fila? ");
		fila = tecl.nextInt();

		System.out.println();

		for (cont = 1; cont <= fila; cont++) {
			System.out.println("Qual idade das pessoas da fila?");
			idade = tecl.nextInt();
			if (idade >= 60) {
				idMaior++;
			} else if (idade < 60) {
				idMenor++;
			}
		}
		System.out.println();
		System.out.println("Na fila tem, " + idMaior + " idosos e " + idMenor + " não idosos.");
	}
}