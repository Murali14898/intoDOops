package singleTonWithThreadSafe;

public class DbConn implements Runnable{
    private static DbConn dbInstanse=null;
    @Override
    public void run() {
       System.out.println(dbInstanse.hashCode());
    }
    public static  DbConn getInstance(){
        if(DbConn.dbInstanse==null){
            dbInstanse=new DbConn();
        }
        return dbInstanse;
    }
}
