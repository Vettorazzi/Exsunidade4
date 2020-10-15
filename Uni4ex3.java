import java.util.Scanner;
public class Uni4ex3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    if (valor1 > valor2) {
        System.out.println("O maior é o valor1");
    } else { 
        System.out.println("O maior é o valor2");
    }
    teclado.close();
}
}




   
    




    

