import java.util.Scanner;

public class Uni4ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("a cor é azul?: ");
        boolean resposta = teclado.nextBoolean();
        if (resposta) {
            System.out.println("sim é azul");
        } else {
            System.out.println("não é azul");
        }
        teclado.close();
    }
}
