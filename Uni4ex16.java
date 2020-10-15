import java.util.Scanner;

public class Uni4ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Idade Homem1: ");
        int idHomem1 = teclado.nextInt();
        System.out.println("Idade Homem2: ");
        int idHomem2 = teclado.nextInt();
        System.out.println("Idade Mulher1: ");
        int idMulher1 = teclado.nextInt();
        System.out.println("Idade Mulher2: ");
        int idMulher2 = teclado.nextInt();

        if ((idHomem1 > idHomem2) && (idMulher1 > idMulher2)) {
            System.out.println("idHomem1 + idMulher2 e idHomem2 * idMulher1");
        } else {
            System.out.println("idHomem2 + idMulher1 e idHomem1 * idMulher2");
        }
        teclado.close();
    }
}