package introToException;

public class ValidPassword extends ReflectiveOperationException{
    public  ValidPassword(){
        super();
    }
    public ValidPassword(String s){
        super(s);
    }
}
