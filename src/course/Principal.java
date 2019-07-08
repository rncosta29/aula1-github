package course;

import java.util.Locale;
import java.util.Scanner;
import util.Banco;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)?");
		char resp = sc.next().charAt(0);
		double saldo;

		Banco banco = new Banco(nome);
		banco.setConta(conta);

		if (resp == 'y') {
			System.out.print("Enter initial deposite value: ");
			saldo = sc.nextDouble();
			banco.addSaldo(saldo);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(banco);

		System.out.println();
		System.out.print("Enter a deposite value: ");
		saldo = sc.nextDouble();
		banco.addSaldo(saldo);

		System.out.println("Update account data:");
		System.out.println(banco);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		saldo = sc.nextDouble();
		banco.removeSaldo(saldo);
		System.out.println("Update account data: \n" + banco);

		sc.close();
	}
}
