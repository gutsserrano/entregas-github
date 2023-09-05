package ex_avaliativo_1.dado;
import java.util.Scanner;

public class main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Dado dado;
        int entrada;
        int i = 0;
        int d;
        int lance = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        entrada = scanner.nextInt();

        while(i < 3){
            if(lance != 2){
                dado = new Dado(entrada);
                d = dado.jogarDado();
                System.out.printf("dado[%d]: %d ", lance+1, d);
                sum += d;
                lance++;
            }else{
                System.out.println("= "+ sum);
                lance = 0;
                sum = 0;
                i++;
            }
        }

    }
}
