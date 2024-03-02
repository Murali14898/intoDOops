package singleTonWithThreadSafetwo;

import java.util.TreeMap;

public class DbConn {
    private static DbConn dbInstance=null;
    private DbConn(){}
//    public static synchronized DbConn getInstance(){
//        if(dbInstance==null){
//            dbInstance=new DbConn();
//        }
//        return dbInstance;
//    }
    public static DbConn getInstance(){
        synchronized (DbConn.class){
        if(dbInstance==null){
            dbInstance=new DbConn();
        } }
        return dbInstance;
    }
}
