package ex_avaliativo_1.triangulo;

public class Triangulo {
    private float a;
    private float b;
    private float c;
    private boolean valido;

    public Triangulo(float a, float b, float c){
        valido = false;
        if(a > 0 && b > 0 && c > 0){
            if(a + b > c){
                if(b + c > a){
                    if(a + c > b){
                        this.a = a;
                        this.b = b;
                        this.c = c;
                        valido = true;
                    }
                }
            }
        }
    }

    private boolean equilatero(){
        boolean retorno;
        retorno = false;
        if(valido){
            if(a == b && b == c){
                retorno = true;
            }
        }
        return retorno;
    }

    private boolean isoceles(){
        boolean retorno;
        retorno = false;
        if(valido){
            if(a == b || a == c || b == c){
                retorno = true;
            }
        }
        return retorno;
    }

    private boolean escaleno(){
        boolean retorno;
        retorno = false;
        if(valido){
            if(a != b && b != c){
                retorno = true;
            }
        }
        return retorno;
    }

    public String getTriangulo(){
        if(valido){
            if(equilatero()){
                return "Equilatero";
            }
            if(isoceles()){
                return "Isoceles";
            }
            if(escaleno()){
                return "Escaleno";
            }
        }
        
        return "Triangulo Invalido";
    }
}
