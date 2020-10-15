import java.util.Scanner;

public class Uni4ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char x = teclado.next().charAt(0);
        x = Character.toUpperCase(x);
        char y = teclado.next().charAt(0);
        y = Character.toUpperCase(y);

        if ((x == 0) && (y == 0)) {
            System.out.println("O quadrante é 0");

        }
        if ((x > 0) && (y > 0)) {
            System.out.println("O quadrante é 1");
        }
        if ((x > 0) && (y < 0)) {
            System.out.println("O quadrante é 2");
        }
        if ((x < 0) && (y < 0)) {
            System.out.println("O quadrante é 3");
        }
        if ((x < 0) && (y > 0)) {
            System.out.println("O quadrante é 4");
        }
        teclado.close();
    }
}
