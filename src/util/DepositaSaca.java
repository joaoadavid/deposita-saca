package util;

public class DepositaSaca {

	private String name;
	private int numeroDaConta;
	private double saldo;

	public DepositaSaca() {

	}

	public DepositaSaca(String name, int numeroDaConta) {

		this.name = name;
		this.numeroDaConta = numeroDaConta;
	}

	public DepositaSaca(String name, int numeroDaConta, double saldoInicial) {
		super();
		this.name = name;
		this.numeroDaConta = numeroDaConta;
		deposito(saldoInicial);
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double deposito) {
		saldo += deposito;
	}
	public void saque (double saque) {
		saldo = saldo - 5 - saque;
	}
	
	@Override
	public String toString() {
		return "Conta " + numeroDaConta + " , Nome: " + name + " , Saldo: $ " + String.format("%.2f", saldo);
	}

}
