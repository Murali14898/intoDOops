package IntroToGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void  main(String[] args){
        Pair p=new Pair();
        System.out.println(p.doSomething(60,28));
        p.doSomething(95,98);
    }
}
