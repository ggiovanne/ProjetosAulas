import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selecao = 1;
        int quantidade = 0;
        double valor = 0;
        double valorTotal = 0;
        
		while ((selecao) >=1 && (selecao<=5)) {
			
		System.out.println("Seja bem vinda(o)");
		System.out.println("Qual lanche você deseja? ");
		System.out.println("--------------------------------");
        System.out.println("CARDÁPIO:");
        System.out.println("--------------------------------");
        System.out.println("|1| Cachorro quente  R$ 4,00");
        System.out.println("|2| X-salada         R$ 4,50");
        System.out.println("|3| X-bacon          R$ 5,00");
        System.out.println("|4| Torrada simples  R$ 2,00");
        System.out.println("|5| Refrigerante     R$ 1,50");
        System.out.println("|6| Não desejo mais pedir");
        System.out.println("--------------------------------");
        
        selecao = sc.nextInt();
        		
        if (selecao == 1) {
            valor = 4.00;
            System.out.println("Qual a quantidade desejada?");
            quantidade = sc.nextInt();
        } else if (selecao == 2) {
          valor = 4.50;
          System.out.println("Qual a quantidade desejada?");
          quantidade = sc.nextInt();
        } else if (selecao == 3) {
          valor = 5.00;
          System.out.println("Qual a quantidade desejada?");
          quantidade = sc.nextInt();
        } else if (selecao == 4) {
            valor = 2.00;
            System.out.println("Qual a quantidade desejada?");
            quantidade = sc.nextInt();
        } else if (selecao == 5) {
        	valor = 1.50;
        	  System.out.println("Qual a quantidade desejada?");
              quantidade = sc.nextInt();
        } else  {  
        
        System.out.println("Obrigado pela compra");
        }
        
        valorTotal = (valorTotal + (valor * quantidade));
        		
		}

        
        System.out.println("O valor total do seu pedido é de: " + valorTotal + "R$");
  

    }
}