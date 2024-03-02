package introdThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args){
//          Hello h=new Hello("Krishna");
          for(int i=1;i<3;i++){
            PrintNumber pn=new PrintNumber(i);
            Thread t=new Thread(pn);
            t.start();
            System.out.println(Thread.currentThread().getName());
          }
    }
}
