package singleTon;

public class DbConn {
    private static DbConn dbInstance=null;
    private DbConn(){}
    public static DbConn getInstance(){
        if(dbInstance==null){
            dbInstance=new DbConn();
        }
        return dbInstance;
    }
}
