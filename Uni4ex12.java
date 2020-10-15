import java.util.Scanner;

public class Uni4ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("lado1: ");
        int lado1 = teclado.nextInt();
        System.out.println("lado2: ");
        int lado2 = teclado.nextInt();
        System.out.println("lado3: ");
        int lado3 = teclado.nextInt();

        if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado3 + lado1 > lado2)) {
            System.out.println("Podem ser comprimentos dos lados de um triângulo");
        } else {
            System.out.println("Não podem ser comprimento dos lados de um triângulo");
        }
        if ((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado1)) {
            System.out.println("É triângulo equilátero");
        } else {
            if ((lado1 == lado2) && (lado3 != lado1) || (lado2 == lado3) && (lado1 != lado2)
                    || (lado1 == lado3) && (lado2 != lado3)) {
                System.out.println("É triângulo isóscele");
            } else {
                if ((lado1 != lado2) && (lado2 != lado3)) {
                    System.out.println("É triângulo escaleno");

                }
                teclado.close();
            }
        }
    }
}
