import java.util.Scanner;

public class Uni4ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ano Nasc Irmão1: ");
        int idIrmão1 = teclado.nextInt();
        System.out.println("Ano Nasc Irmão2: ");
        int idIrmão2 = teclado.nextInt();
        System.out.println("Ano Nasc Irmão3: ");
        int idIrmão3 = teclado.nextInt();

        if ((idIrmão1 == idIrmão2) && (idIrmão3 != idIrmão1) && (idIrmão3 != idIrmão2)) {
            System.out.println("GÊMEOS.");
        } else {
            if((idIrmão1 != idIrmão2) && (idIrmão3 != idIrmão1) && (idIrmão3 != idIrmão2))
            System.out.println("IRMÃOS."); 
        } else {
            System.out.println("TRIGÊMEOS."); 

        } teclado.close();
    }
}
