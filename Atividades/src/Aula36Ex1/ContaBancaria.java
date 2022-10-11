package Aula36Ex1;

public class ContaBancaria {

	String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			System.out.println("Sacando da sua conta o valor de R$ " + valor);
			saldo -= valor;
		} else if (saldo == 0) {
			System.out.println("Você não possui saldo em sua conta");
		}else {
			System.out.println("Valor indisponível para saque, tente um valor menor");
		}
	}
	
	public void depositar (double valor) {
		saldo += valor;
		System.out.println("Depósito concluído com sucesso!");
		System.out.println("Saldo atual de R$ " + saldo);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
