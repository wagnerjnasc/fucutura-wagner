package br.com.atividade1;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		int mes;

		System.out.println("Qual o m�s que voc� nasceu? ");
		mes = tecl.nextInt();

		System.out.println();
		switch (mes) {
		case 1:
			System.out.println("Voc� nasceu em Janeiro!");
			break;
		case 2:
			System.out.println("Voc� nasceu em Fevereiro!");
			break;
		case 3:
			System.out.println("Voc� nasceu em Mar�o!");
			break;
		case 4:
			System.out.println("Voc� nasceu em Abril!");
			break;
		case 5:
			System.out.println("Voc� nasceu em Maio!");
			break;
		case 6:
			System.out.println("Voc� nasceu em Junho!");
			break;
		case 7:
			System.out.println("Voc� nasceu em Julho!");
			break;
		case 8:
			System.out.println("Voc� nasceu em Agosto!");
			break;
		case 9:
			System.out.println("Voc� nasceu em Setembro!");
			break;
		case 10:
			System.out.println("Voc� nasceu em Outubro!");
			break;
		case 11:
			System.out.println("Voc� nasceu em Novembro!");
			break;
		case 12:
			System.out.println("Voc� nasceu em Dezembro!");
			break;

		default:
			System.out.println("M�s inv�lido, use n�meros.");
			break;
		}
	}

}
