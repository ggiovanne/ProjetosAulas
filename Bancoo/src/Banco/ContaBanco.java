package Banco;

//ATRIBUTOS
//tipo = CC ou CP
//status = aberta ou fechada

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	

//MÉTODOS 

	// CC ganha 50 R$ CP ganha 150 R$
	// abrir conta somente se ela estiver ativa
	public void abrirConta(String t) {
		if (status == false) {
			this.setTipo(t);
			this.setStatus(true);
			if (t == "CC") {
				// BOA PRÁTICA DE SEGURANÇA trocar this.saldo = 50; para this.setSaldo(50);
				this.setSaldo(50);
				System.out.println("Você abriu uma conta corrente!");
			} else if (t == "CP") {
				this.setSaldo(150);
				System.out.println("Você abriu uma conta poupança!");
			}else {
				System.out.println("Problemas na abertura da conta");
				this.setTipo(null);
				this.setStatus(false);
			}

		} else {
			System.out.println("Não tem conta nova!");
		}
	}

// p/ fechar não pode ter saldo e nem debito	
	public void fecharConta() {
		if (this.status == true) {
			if (this.getSaldo() > 0) {
				System.out.println("tem dinheiro.");
			} else if (this.getSaldo() < 0) {
				System.out.println(" em débito");
			} else {
				this.setStatus(false);
				System.out.println("A conta está encerrada!");
			}
		} else {
			System.out.println("você não tem conta nesse banco!");
		}

	}

	public void depositar(double deposito) {
		if (this.status == true) {
			if (deposito > 0) {
				this.saldo += deposito;
				System.out.println("Seu depósito foi feito com sucesso!");
			} else {
				System.out.println("Valor inválido.");
			}

		} else {
			System.out.println("Não foi possível depositar, pois a conta não foi aberta!");
		}
	}

		public boolean sacar(double valor) {
			// mesma coisa que a linha de baixo! if (isStatus() == true) {
					if (isStatus()) {
						if (this.getSaldo() >= valor) {
							this.setSaldo(this.getSaldo() - valor);
							System.out.println("O valor do saque  R$ " + valor);
							System.out.println("Seu saldo agora é R$ : " + this.getSaldo());
							return true;
			} else {
							System.out.println("O saldo é insuficiente para esse saque!");
							return false;
						}
					} else {
						System.out.println("Impossível sacar, conta fechada!");
						return false;
					}
				}

//  CC saca 12 R$  CP saca 20 R$
		public void pagarMensal(String tipoConta) {
			if (this.status) {
				int mensalidade = 0;
				if (tipoConta == "CC") {
					mensalidade = 12;
				} else {
					mensalidade = 20;

				}
				if (!sacar(mensalidade)) {
					System.out.println("O saldo é insuficente para pagar a mensalidade. Seu saldo é de R$: " + saldo);
				} else {
					System.out.println("Mensalidade paga com sucesso!");
				}
			}
		}
//GET E SET
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
