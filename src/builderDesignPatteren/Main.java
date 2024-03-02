package builderDesignPatteren;

public class Main {
    public static void main(String[] args) {
//        StudentHelper sh=new StudentHelper();
//        sh.setSid("101");
//        sh.setName("Ram");
        Student s=Student.getInstance().build();

    }
}
