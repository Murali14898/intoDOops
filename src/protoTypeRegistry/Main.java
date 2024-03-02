package protoTypeRegistry;

public class Main {
    public static void main(String[] args) {
        Student s=new InteliStudent();
        s.setNams("Murali");
        s.setBatch("101");
        Student s1=s.copy();
        System.out.println("dhdh");
    }
}
