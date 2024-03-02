package introdThreads;

public class Hello implements Runnable{
    String name;
    Hello(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("Hello welcome to scaler "+name);
    }
}
