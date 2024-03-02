package Decorator;

public class Main {
    public static void main(String[] args) {
        Mobile m=new Apple();
        m=new Cover(m);
        m=new GlassCover(m);
        System.out.println(m.getPrice());
    }
}
