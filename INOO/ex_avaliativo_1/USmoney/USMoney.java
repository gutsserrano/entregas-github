package ex_avaliativo_1.USmoney;

public class USMoney {
    
    private int dollars;
    private int cents;

    public USMoney(int dollar, int cent){
        if(dollar > 0 && cent > 0){
            int temp = 0;
            while(cent > 99){
                temp = cent / 100;
                cent = cent % 100;
            }
            this.cents = cent ;
            this.dollars = dollar + temp;
        }
    }

    public USMoney plus(USMoney obj){
        USMoney x;
        x = new USMoney((this.dollars+obj.dollars), (this.cents+obj.cents));
        return x;
    }

    public String getAll(){
        return "$ "+this.dollars+"."+this.cents;
    }
}
