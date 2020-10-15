import java.util.Scanner;

public class Uni4ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com opção: ");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
        }
        if (opcao == 1) {
            System.out.println("Bacharel em Ciência da Computação");
        }
        if (opcao == 2) {
            System.out.println("Licenciado em Computação");
        }
        if (opcao == 3) {
            System.out.println("Bacharel em Sistemas de Informação");
        }
        teclado.close();
    }
}