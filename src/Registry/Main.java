package Registry;

public class Main {
    public static void fillRegistry(StudentRegistry s1){
        Student stu=new Student();
        s1.register("student",stu);
        Student s=new Student();
        s.batch="A";
        System.out.println(s.hashCode());
        s1.register("studentBatchA",s);
        s1.register("IntelligetStudent",new InStudent());
    }
    public static void main(String[] args) {
        StudentRegistry sr=new StudentRegistry();
        fillRegistry(sr);
//        Student s=new Student();
//        s.name="Murali";
//        s.sid="1e1e";
//        Student s1=s.copy();
        Student batchA=sr.get("studentBatchA");
        System.out.println(batchA.hashCode());
//        batchA.batch="B";
//        Student b=sr.get("studentBatchA");
//        Student sb=sr.get("studentBatchA");
        //this is the main object from which we should copy if someone kill then what we will copy
        //so instead of getting the main object then create copy , we should directly return a copy in get method of registry
        batchA.batch="B";
        Student bachA=sr.get("studentBatchA");
        System.out.println(bachA.hashCode());

        Student batA=batchA.copy();
        System.out.println("dhdh");
    }
}
