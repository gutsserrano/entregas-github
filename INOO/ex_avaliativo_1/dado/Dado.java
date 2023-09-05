package ex_avaliativo_1.dado;
import java.util.Random;

public class Dado {
    
    private int lados;

    public Dado(int n){
        if(n > 0){
            this.lados = n;
        }
    }

    public int jogarDado(){
        int retorno;
        Random random = new Random();
        retorno = random.nextInt(lados) + 1;
        return retorno;
    }
}
