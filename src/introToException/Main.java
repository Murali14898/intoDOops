package introToException;

public class Main {
    public static void main(String[] args) {

        User u=new User();
        try {
            u.performLogin("muRA123","m123");
        }
        catch(ClassNotFoundException e){
            System.out.println("User Not Created"+" "+e.getMessage());
        }
        catch (ValidPassword v){
            System.out.println("User Not Created"+" "+v.getMessage());
        }
    }
}
