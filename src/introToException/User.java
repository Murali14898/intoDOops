package introToException;

public class User {
    private String userName="MURA123";
    private String password="m123";
    public void performLogin(String uname,String password) throws ClassNotFoundException,ValidPassword{ //ReflectiveOperationException
        if(!uname.equalsIgnoreCase(this.userName)) {
            throw new ClassNotFoundException("Please Enter valid Username");
        }
        if(!this.password.equals(password)){
            throw new ValidPassword("Enter valid password");
        }
        this.redirectToLoginPage();
    }
    private void redirectToLoginPage(){
        System.out.println("Hi "+this.userName+" Welcome Again");
    }
}
