package br.com.atividade1;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		int mes;

		System.out.println("Qual o mês que você nasceu? ");
		mes = tecl.nextInt();

		System.out.println();
		switch (mes) {
		case 1:
			System.out.println("Você nasceu em Janeiro!");
			break;
		case 2:
			System.out.println("Você nasceu em Fevereiro!");
			break;
		case 3:
			System.out.println("Você nasceu em Março!");
			break;
		case 4:
			System.out.println("Você nasceu em Abril!");
			break;
		case 5:
			System.out.println("Você nasceu em Maio!");
			break;
		case 6:
			System.out.println("Você nasceu em Junho!");
			break;
		case 7:
			System.out.println("Você nasceu em Julho!");
			break;
		case 8:
			System.out.println("Você nasceu em Agosto!");
			break;
		case 9:
			System.out.println("Você nasceu em Setembro!");
			break;
		case 10:
			System.out.println("Você nasceu em Outubro!");
			break;
		case 11:
			System.out.println("Você nasceu em Novembro!");
			break;
		case 12:
			System.out.println("Você nasceu em Dezembro!");
			break;

		default:
			System.out.println("Mês inválido, use números.");
			break;
		}
	}

}
