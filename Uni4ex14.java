import java.util.Scanner;

public class Uni4ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um mês entre 1 e 12: ");
        int mês = teclado.nextInt();
        System.out.println("Digite um ano: ");
        int ano = teclado.nextInt();
        if ((mês == 2) && (ano % 400 == 0) || (mês == 2) && (ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println("Digite um dia entre 1 e 29: ");
        }
        if ((mês == 2) && (ano % 400 != 0) || (mês == 2) && (ano % 4 != 0) && (ano % 100 == 0)) {
            System.out.println("Digite um dia entre 1 e 28: ");
        } else {
            System.out.println("Digite um dia entre 1 e 31: ");
        }
        teclado.close();
    }
}
