import java.util.Scanner;

public class Uni4ex26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um Char: ");
		char opcao = teclado.next().charAt(0);
        System.out.println("Char: " + opcao);
        char T = teclado.next().charAt(0);
        char Q = teclado.next().charAt(0);
        char R = teclado.next().charAt(0);
        char C = teclado.next().charAt(0);
        System.out.println("Informe uma base: ");
		int b = teclado.nextInt();
        System.out.println("int: " + b);
        System.out.println("Informe uma altura: ");
		int h = teclado.nextInt();
        System.out.println("int: " + h);
        int areaTriangulo = teclado.nextInt();
        areaTriangulo = b * h;
        System.out.println("Informe um lado: ");
		int l = teclado.nextInt();
        int areaQuadrado = teclado.nextInt();
        areaQuadrado = l * l;
        int areaRetangulo = teclado.nextInt();
        areaRetangulo = b * h;

        System.out.println("Escreva o valor do raio: ");
     
            double Raio = teclado.nextFloat();
            double areaCirculo = Math.PI * Raio * Raio;
                
            switch (opcao) {
            case 1:
                System.out.println("T");
                break;
            case 2:
                System.out.println("Q");
                break;
            case 3:
                System.out.println("R");
                break;
                case 4: 
                System.out.println("C");

                if(opcao == T) {
                    System.out.println("areaTriangulo");
                } 
                if(opcao == Q) {
                    System.out.println("areaQuadrado");
                }
                if(opcao == R) {
                    System.out.println("areaRetangulo");
                }
                if (opcao == C) {
                    System.out.println("areaCirculo");
                }
            } teclado.close();
        }
    }
}