package singleTonWithThreadSafetwo;

public class Caller implements Runnable{
    @Override
    public void run() {
        System.out.println(DbConn.getInstance().hashCode());
    }
}
