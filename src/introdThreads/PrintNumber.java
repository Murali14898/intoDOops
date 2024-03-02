package introdThreads;

public class PrintNumber implements Runnable{
    int num;
    PrintNumber(int num){
        this.num=num;
    }
    @Override
    public void run(){
        System.out.print(num+" ");
    }
}
