package IntroToGenerics;

public class Pair {
//    V x;
//    V y;
//    public void setX(V x){
//        this.x=x;
//    }
//    public void setY(V y){
//        this.y=y;
//    }
//    public V doOperation(){
//       return (V)(this.x + this.y);
//    }
//    public V getY(){
//        return y;
//    }
    public <Vv extends Number,Ss extends Integer> String doSomething(Vv num,Ss num2){
        double score=num.intValue()+num2.intValue();
        return "Hi Your Score is "+score;
    }
}
