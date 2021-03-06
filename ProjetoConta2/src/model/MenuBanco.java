package model;

import java.util.Scanner;

public class MenuBanco extends Conta {
	
	Scanner leia = new Scanner(System.in);
	int operaid;
	char operacao;

	public MenuBanco() {
		System.out.println("** BEM VINDO AO BANCO OLIVERWS **");
		System.out.println("");
		System.out.println("|------------ MENU ------------|");
		System.out.println("| 1- CRIAR CONTA               |");
		System.out.println("| 2- CONSULTAR SALDO           |");
		System.out.println("| 3- SAQUE                     |");
		System.out.println("| 4- DEP?SITO                  |");
		System.out.println("| 5- TRANSFER?NCIA             |");
		System.out.println("|------------------------------|");
		System.out.println("");
		System.out.printf("Selecione a opera??o desejada: ");
		operaid = leia.nextInt();

		switch (operaid) {
		case 1:
			menuCriarConta();
			break;
		case 2:
			super.mostrarSaldo();
			break;
		case 3:
			super.sacar();
			break;
		case 4:
			super.depositar();
			break;
		case 5:
			Conta c2 = null;
			super.transferir(c2, 100);
			break;
		}
	}

	public void menuCriarConta() {
		System.out.println("\n");
		System.out.println("********* CRIAR CONTA *********");
		System.out.println("");
		System.out.println("|------------ MENU ------------|");
		System.out.println("| 1- CONTA CORRENTE            |");
		System.out.println("| 2- CONTA INVESTIMENTO        |");
		System.out.println("| 3- VOLTAR AO MENU            |");
		System.out.println("|------------------------------|");
		System.out.println("");
		System.out.println("Selecione a opera??o desejada: ");
		operaid = leia.nextInt();

		switch (operaid) {
		case 1:
			new ContaCorrente();
			System.out.println("CRIAR CONTA CORRENTE");
			break;

		case 2:
			new ContaInvestimento();
			System.out.println("CRIAR CONTA INVESTIMENTO");
			break;

		case 3:
			System.out.println("** BEM VINDO AO BANCO OLIVERWS **");
			System.out.println("");
			System.out.println("|------------ MENU ------------|");
			System.out.println("| 1- CRIAR CONTA               |");
			System.out.println("| 2- CONSULTAR SALDO           |");
			System.out.println("| 3- SAQUE                     |");
			System.out.println("| 4- DEP?SITO                  |");
			System.out.println("| 5- TRANSFER?NCIA             |");
			System.out.println("|------------------------------|");
			System.out.println("");
			System.out.printf("Selecione a opera??o desejada: ");
			operaid = leia.nextInt();
			// limpatela();
			break;
		}
	}

	public static void limpatela() {
		System.out.printf("\n\n\n");
	}
}