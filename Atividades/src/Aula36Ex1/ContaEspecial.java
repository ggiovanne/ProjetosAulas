package Aula36Ex1;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	

	public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= this.getSaldo() && valor < limite) {
			System.out.printf("Sacando da sua conta o valor de R$ %02d", valor);
		} else if (this.getSaldo() == 0) {
			System.out.println("Você não possui saldo em sua conta");
		} else {
			System.out.println("Valor indisponível para saque, tente um valor menor");
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
