import java.util.Scanner;

public class Uni4ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a massa em kg: ");
        double massa = teclado.nextDouble();
        System.out.println("Digite a altura em metros: ");
        double altura = teclado.nextDouble();
        double IMC = massa / altura * altura;

        if (IMC < 18.5) {
            System.out.println("Magreza");
        }
        if ((IMC >= 18.5) && (IMC <= 24.9)) {
            System.out.println("Saudável");
        }
        if ((IMC >= 25.0) && (IMC <= 29.9)) {
            System.out.println("Sobrepeso");
        }
        if ((IMC >= 30.0) && (IMC <= 34.9)) {
            System.out.println("Obesidade Grau I");
        }
        if ((IMC >= 35.0) && (IMC <= 39.9)) {
            System.out.println("Obesidade Grau II Severa");
        }
        if (IMC >= 40) {
            System.out.println("Obesidade Grau III Morbida");
        }
        teclado.close();
    }
}
