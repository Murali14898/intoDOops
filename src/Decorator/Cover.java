package Decorator;

public class Cover implements ExtraFetures{
    private int price=1000;
    Mobile m;
    public Cover(Mobile m){
        this.m=m;
    }
    public int getPrice(){
        return this.price+m.getPrice();
    }
}
