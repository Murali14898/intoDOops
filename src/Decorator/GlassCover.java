package Decorator;

public class GlassCover implements ExtraFetures{
    private int price=2000;
    Mobile m;
    public GlassCover(Mobile m){
        this.m=m;
    }

    @Override
    public int getPrice() {
        return this.price+m.getPrice();
    }
}
