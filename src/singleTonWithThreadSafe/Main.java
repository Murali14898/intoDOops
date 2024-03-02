package singleTonWithThreadSafe;

public class Main {
    public static void main(String[] args) {
        Runnable r=DbConn.getInstance();
        Thread t1=new Thread(r);
        t1.start();;
        Thread t2=new Thread(r);
        t2.start();
    }
}
