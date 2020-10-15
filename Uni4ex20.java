import java.util.Scanner;

public class Uni4ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nota1: ");
        double Nota1 = teclado.nextDouble();
        System.out.println("Nota2: ");
        double Nota2 = teclado.nextDouble();
        System.out.println("Nota3: ");
        double Nota3 = teclado.nextDouble();
        System.out.println("Notaexs: ");
        double Notaexs = teclado.nextDouble();
        double mediaAproveitamento = (Nota1 + Nota2 * 2 + Nota3 * 3 + Notaexs) / 7;

        if (mediaAproveitamento >= 9.0) {
            System.out.println("Conceito A é aprovado");
        }

        if ((mediaAproveitamento >= 7.5) && (mediaAproveitamento < 9.0)) {
            System.out.println("Conceito B é aprovado");
        }

        if ((mediaAproveitamento >= 6.0) && (mediaAproveitamento < 7.5)) {
            System.out.println("Conceito C é aprovado");
        }

        if ((mediaAproveitamento >= 4.0) && (mediaAproveitamento < 6.0)) {
            System.out.println("Conceito D é reprovado");
        }

        if (mediaAproveitamento < 4.0) {
            System.out.println("Conceito E é reprovado");
        }
        teclado.close();
    }
}
