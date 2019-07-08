package course;

import java.util.Scanner;

import util.Clientes;

public class Aluguel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented?");
		int x = 1;
		int n = sc.nextInt();
		Clientes[] vect = new Clientes[10];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + x);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Clientes(nome, email);
			x++;
			System.out.println();
		}
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
