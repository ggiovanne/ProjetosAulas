package Aula36Ex1;

public class Programa {
	public static void main(String[] args) {
		
		ContaP contap = new ContaP();
		contap.saldo = 150;
		contap.limite = 500;
		contap.sacar(650);
		
		
		
		
		
//		
//		ContaPoupanca cp = new ContaPoupanca("Júlio", 3344, 100);
//		cp.sacar(30);
//		cp.depositar(100);
//		cp.calcularNovoSaldo();
//		System.out.println("Nome do cliente: " + cp.getNomeCliente());
//		System.out.println("Número da conta: " + cp.getNumConta());
//		System.out.println("Saldo em conta: " + cp.getSaldo());
//		
//		System.out.println("-------------------------------------------");
//		
//		ContaEspecial ce = new ContaEspecial("Júlia", 3944, 150, 50);
//		ce.sacar(30);
//		ce.depositar(100);
//		ce.getLimite();
//		System.out.println("Nome do cliente: " + ce.getNomeCliente());
//		System.out.println("Número da conta: " + ce.getNumConta());
//		System.out.println("Saldo em conta: " + ce.getSaldo());
		
	}
}
