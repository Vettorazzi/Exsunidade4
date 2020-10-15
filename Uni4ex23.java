import java.util.Scanner;

public class Uni4ex23 {
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
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            case 12:
                System.out.println("12");
                break;
        }
        if (opcao > 12) {
            System.out.println("O valor não é válido");
        }
        if (opcao == 1) {
            System.out.println("JANEIRO");
        }
        if (opcao == 2) {
            System.out.println("FEVEREIRO");
        }
        if (opcao == 3) {
            System.out.println("MARÇO");
        }
        if (opcao == 4) {
            System.out.println("ABRIL");
        }
        if (opcao == 5) {
            System.out.println("MAIO");
        }
        if (opcao == 6) {
            System.out.println("JUNHO");
        }
        if (opcao == 7) {
            System.out.println("JULHO");
        }
        if (opcao == 8) {
            System.out.println("AGOSTO");
        }
        if (opcao == 9) {
            System.out.println("SETEMBRO");
        }
        if (opcao == 10) {
            System.out.println("OUTUBRO");
        }
        if (opcao == 11) {
            System.out.println("NOVEMBRO");
        }
        if (opcao == 12) {
            System.out.println("DEZEMBRO");
        }
        teclado.close();
    }
}
