package ex_avaliativo_1.USmoney;

public class main {
    
    public static void main(String[] args) {
        USMoney a, b, r;

        a = new USMoney(7, 70);
        b = new USMoney(10, 20);
        r = a.plus(b);
        System.out.println(r.getAll());

        a = new USMoney(0, 0);
        b = new USMoney(3, 37);
        r = a.plus(b);
        System.out.println(r.getAll());

        a = new USMoney(67, 25);
        b = new USMoney(0, 0);
        r = a.plus(b);
        System.out.println(r.getAll());
    }
}
