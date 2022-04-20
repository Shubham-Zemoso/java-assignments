package lambdas;

interface Tradable{
    boolean check(Trade t);
}
public class Trade{
    int val;
    Trade(int val){
        this.val=val;
    }
    public static void main(String[] args) {
        Trade trade=new Trade(2000);
        Tradable tradable=(Trade t)->t.val>1000;
        System.out.println(tradable.check(trade));
    }
}

