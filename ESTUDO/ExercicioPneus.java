
import java.util.Scanner;

public class ExercicioPneus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Pressão do Pneu Dianteiro Direito");
        int a = sc.nextInt();
        System.out.println("Digite a Pressão do Pneu Dianteiro Esquerdo");
        int b = sc.nextInt();
        System.out.println("Digite a Pressão do Pneu Traseiro Direito");
        int c = sc.nextInt();
        System.out.println("Digite a Pressão do Pneu Traseiro Esquerdo");
        int d = sc.nextInt();

        boolean pressaoideal;
        if (a >= 30 || a <= 32) {
            System.out.println("A Pressão do Pneu Dianteiro Direito " + a + " é: ");
        } else {
            pressaoideal = false;
            System.out.println("A Pressão do Seu Pneu não é Ideal");
            if (b >= 30 || b <= 32) {
                System.out.println("A Pressão do Pneu Dianteiro Esquerdo " + b + " é: ");
            } else {
                pressaoideal = false;
                System.out.println("A Pressão do seu Pneu não é Ideal");
                if (c >= 29 || c <= 31) {
                    System.out.println("A Pressão do Pneu Traseiro Direito " + c + " é: ");
                } else {
                    pressaoideal = false;
                    System.out.println("A Pressão do seu Pneu não é Ideal");
                    if (d >= 29 || d <= 31) {
                        System.out.println("A Pressão do Pneu Traseiro Esquerdo " + d + " é: ");
                    } else {
                        pressaoideal = false;
                        System.out.println("A Pressão do seu Pneu não é Ideal");
                    }
                }
            }
        }
    }
}
