package singleTonWithThreadSafetwo;

public class Main {
    public static void main(String[] args) {
        Caller c=new Caller();
        Thread t1=new Thread(c);
        t1.start();
        Thread t2=new Thread(c);
        t2.start();
    }
}
