package application;

import java.util.Scanner;

import java.util.Locale;

import util.DepositaSaca;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DepositaSaca conta;

		System.out.print("Enter account number: ");
		int numeroDaConta = sc.nextInt();

		sc.nextLine();
		System.out.print("Entre com seu nome: ");
		String name = sc.nextLine();

		System.out.print("Você tem um deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S' || resposta == 's') {
			System.out.print("Digite o valor do deposito: ");
			double saldo = sc.nextDouble();
			conta = new DepositaSaca(name, numeroDaConta, saldo);
		} else {
			conta = new DepositaSaca(name, numeroDaConta);
		}

		System.out.println("Account Data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do deposito: ");
		double valorDepositado = sc.nextDouble();
		conta.deposito(valorDepositado);
		
		System.out.println("Conta Atualizada: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do sacado: ");
		double valorSacado = sc.nextDouble();
		conta.saque(valorSacado);
		
		System.out.println("Conta Atualizada: ");
		System.out.println(conta);

		sc.close();

	}

}
