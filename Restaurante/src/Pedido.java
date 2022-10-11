import java.util.ArrayList;

public class Pedido {
	private String nomeCliente;
	private ArrayList<Item> itensConsumidos;
	private boolean taxaServico;

	public Pedido() {
		itensConsumidos = new ArrayList<Item>();
	}

	public double calcularTotal() {
		double resultados = 0;

		for (int i = 0; i < itensConsumidos.size(); i++) {

			Item item = itensConsumidos.get(i);
			resultados += item.getPreco();
		}

		if (taxaServico) {
			//resultados = (resultados * 1.15);
			resultados += (resultados * 0.15);
		} 

		return resultados;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Item> getItensConsumidos() {
		return itensConsumidos;
	}

	public boolean isTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(boolean taxaServico) {
		this.taxaServico = taxaServico;
	}

	public void setItensConsumidos(ArrayList<Item> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

}
