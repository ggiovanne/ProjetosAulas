package Aula36Ex1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	Calendar hoje = Calendar.getInstance();
	
	private int diaRendimento;

	public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
		super(nomeCliente, numConta, saldo);
	}

	public void calcularNovoSaldo() {
		 if (hoje.get(Calendar.DAY_OF_MONTH) == 12) {
			 System.out.println("O saldo anterior era de R$ " + this.getSaldo()); 
			 this.setSaldo(getSaldo() + (this.getSaldo() * 0.10)); 
			 System.out.println("O saldo atual (após o rendimento) é de R$ " + this.getSaldo());
			 
		 }else {
			 System.out.println("O dia correto para rendimento é todo dia 15 do mês");
		 }
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

}
