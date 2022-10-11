import java.util.Scanner;

public class TesteCaneta {
    
    static Scanner sc = new Scanner(System.in);
    static Caneta selecionada;


    public static void main(String[] args) {
       
    	Caneta caneta1 = new Caneta ();
        caneta1.setNome("caneta1");
        caneta1.setTipo("BIC");
        caneta1.setCor("vermelha");
        caneta1.tampar();
        
        //System.out.println(caneta1.getTampa());
        
        Caneta caneta2 = new Caneta ();
        caneta2.setNome("caneta2");
        caneta2.setTipo("TINTEIRO");
        caneta2.setCor("Preta");
        caneta2.tampar();
        
        //System.out.println(caneta2.getTampa());
        
        
        Caneta caneta3 = new Caneta ();
        caneta3.setNome("caneta3");
        caneta3.setTipo("BIC ");
        caneta3.setCor("Azul");
        caneta3.destampar();
        
        Caneta canetaSelecionada;
        int opcaoMenu = 0;
        Scanner sc = new Scanner (System.in);
        
        //System.out.println(caneta3.getTampa());
        
        do {
        	System.out.println("Escolha uma caneta: ");
        	System.out.println("[1] CANETA VERMELHA "); 
        	System.out.println("[2] CANETA PRETA "); 
        	System.out.println("[3] CANETA AZUL "); 
        	System.out.println("[4] SAIR "); 
        
        opcaoMenu = sc.nextInt();	
                  
            switch(opcaoMenu) {
            case 1: 
                selecionada = caneta1;
                break;
                
            case 2:
                selecionada = caneta2;
                break;
                
            case 3:
                selecionada = caneta3;
                break;
                
            case 4:
                System.out.println("Operação finalizada ");
                break;
            default: 
                System.out.println("Opção invalida" );
                break;    
            }
        
            System.out.println("Escolha uma ação: ");
            System.out.println("[1] TAMPAR "); 
            System.out.println("[2] DESTAMPAR "); 
            System.out.println("[3] RABISCAR"); 
            System.out.println("[4] PINTAR "); 
            
            switch(sc.nextInt()) {
            case 1: 
                selecionada.tampar();
           
                break;
                
            case 2:
                selecionada.destampar();
                
                break;
                
            case 3:
                selecionada.rabiscar();
                break;
                
            case 4:
                selecionada.pintar();
                break;
            default: 
                System.out.println("Opção invalida" );
                break;    
            }
          
         
        }
        while (opcaoMenu != 4);

    }
}
