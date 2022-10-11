package Aula36Ex1;

public class ContaP {

	double limite;// 500
	double saldo;// 150
					// 1050

	void sacar(double valor) {
		if (saldo >= valor) {
			System.out.println("Saldo em conta (antes do saque) de R$ " + saldo);
			saldo = saldo - valor;
			System.out.println("Saque concluído com sucesso");
			System.out.println("Saldo em conta de R$ " + saldo);
		}else
		if (saldo + limite >= valor) {// 350

			System.out.println("Saldo em conta (antes do saque) de R$ " + saldo);
			System.out.println("Limite anterior de R$ " + limite);
			valor = valor - saldo; // valor = 200
			saldo = 0;
			limite = limite - valor;

			System.out.println("Saque concluído com sucesso");
			System.out.println("Saldo em conta de R$ " + saldo);
			System.out.println("Limite atual de R$ " + limite);
			System.out.println("Saldo com limite: " + (limite + saldo));
		} else {
			System.out.println("Saldo indisponível para saque! ");
		}

	}

}
