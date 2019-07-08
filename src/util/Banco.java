package util;

public class Banco {
	private int conta;
	private String nome;
	private double saldo;

	public Banco(int conta, String nome, double saldoinicial) {
		this.conta = conta;
		this.nome = nome;
		addSaldo(saldoinicial);
	}

	public Banco(String nome) {
		this.nome = nome;
	}

	public int getConta(int conta) {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}

	public void removeSaldo(double saldo) {
		this.saldo -= saldo + 5;
	}

	public String toString() {
		return "Account " + String.format("%d", conta) + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f", saldo);
	}
}
