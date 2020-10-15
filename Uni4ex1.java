import java.util.Scanner;

public class Uni4ex1 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Horas trabalhadas mes: ");
            int horas = teclado.nextInt();
            int horasExtras = teclado.nextInt();
            double salarioHora = teclado.nextDouble();
            double salarioHoraExtra = teclado.nextDouble();
            double salario = teclado.nextDouble();
            double salarioTotal = teclado.nextDouble();
            salario = Horas trabalhadas mes * salarioHora;
            salarioHoraExtra = salarioHora + (salarioHora * 50) / 100;
            salarioTotal = salario + salarioHoraExtra;




            if (Horas trabalhadas mes <= 160) {
                System.out.println("salario");

            } else {
                if(Horas trabalhadas mes > 160) {
                    System.out.println("salarioTotal");

                } teclado.close();

                
            }






            

        }

}