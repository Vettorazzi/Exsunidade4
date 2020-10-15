import java.util.Scanner;

public class Uni4ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um Double: ");
		double valorDouble = teclado.nextDouble();
		System.out.println("Double: " + valorDouble);
        restoDouble = valorDouble % 1;

        if (restoDouble == 0) {
            System.out.println("não foram digitadas casas decimais");

        } else {
            if (restoDouble > 0) {
                System.out.println("foram digitadas casas decimais");
            }

        }
        teclado.close();

    }

}
