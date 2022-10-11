public class Caneta {

	//ATRIBUTOS-> CARACTERISTICAS DOS OBJETOS
    private String nome;
    private String tipo;
    private String cor;
    private boolean tampa;

    // MÉTODOS
    
    public void tampar() {
    	this.tampa = true;
        System.out.println("A " + this.tipo + " foi tampada! ");
    }

    public void destampar() {
        this.tampa = false;
        System.out.println("A " + this.tipo + " foi des5tampada! ");    
    }

    public void rabiscar() {
        if (this.tampa == true) {
            System.out.println("Não posso rabiscar");
        } else {
            System.out.println("Rabiscando com a caneta " + nome + cor);
        }
    }

    public void pintar() {
        if (this.tampa == true) {
            System.out.println("Não posso pintar");
        } else {
            System.out.println(" Pintando com a caneta " + nome + cor);
        }
    }
    
    //MÉTODOS ESPECIAIS (GETTERS E SETTERS)
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }


}