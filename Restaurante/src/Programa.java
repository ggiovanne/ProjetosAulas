public class Programa {
public static void main(String[] args) {
	
	Lanche xTudo = new Lanche (32.50, 1.2f, "X-tudo","Pão, presunto, mussarela, alface, tomate, batata, milho, molho especial de bacon");
	
	Bebida coca = new Bebida (7.50, "Coca cola", 2, false);
	
	//47.50
	Pedido n001 =  new Pedido();
	n001.setNomeCliente("Junior");
	n001.getItensConsumidos().add(coca);
	n001.getItensConsumidos().add(coca);
	n001.getItensConsumidos().add(xTudo);
	System.out.println("O total do pedido de " + n001.getNomeCliente() + " foi de " + n001.calcularTotal());
	
	//83.37
	Pedido n002 = new Pedido();
	n002.setNomeCliente("Carina");
	n002.setTaxaServico(true);
	n002.getItensConsumidos().add(xTudo);
	n002.getItensConsumidos().add(coca);
	n002.getItensConsumidos().add(xTudo);
	
	System.err.println("O total do pedido de " + n002.getNomeCliente() + " foi de " + n002.calcularTotal());
	
	//80.00
	Pedido n003 = new Pedido();
	n003.setNomeCliente("Andy");
	n003.setTaxaServico(false);
	n003.getItensConsumidos().add(coca);
	n003.getItensConsumidos().add(xTudo);
	n003.getItensConsumidos().add(coca);
	n003.getItensConsumidos().add(xTudo);
	System.out.println("Total: " +n003.calcularTotal());
	}
}
