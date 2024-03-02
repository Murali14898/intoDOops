package singleTon;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        DbConn d1=DbConn.getInstance();
        System.out.println(d1.hashCode());
        DbConn d2=DbConn.getInstance();
        System.out.println(d2.hashCode());
    }
}
