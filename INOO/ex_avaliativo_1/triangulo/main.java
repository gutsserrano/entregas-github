package ex_avaliativo_1.triangulo;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        
        Scanner scanner;
        Triangulo triangulo;
        String resultado;
        float a, b, c;

        scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();

            triangulo = new Triangulo(a, b, c);
            resultado = triangulo.getTriangulo();
            System.out.println(resultado);
        }
    }
}
