import java.util.Scanner;

public class Uni4ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um caracter: ");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'A') {
            System.out.println("é vogal");

        } else {
            if (letra == 'E') {
                System.out.println("é vogal");

            } else {
                if (letra == 'I') {
                    System.out.println("é vogal");
                } else {
                    if (letra == 'O') {
                        System.out.println("é vogal");
                    } else {
                        if (letra == 'U') {
                            System.out.println("é vogal");
                        } else {
                            System.out.println("Não é vogal");

                        }
                    }
                }
                teclado.close();
            }
        }
    }
}