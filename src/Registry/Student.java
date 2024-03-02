package Registry;

public class Student implements Prototype<Student>{
    String name;
    String sid;
    String batch;
    Student(){}
    Student(Student s){
        this.name=s.name;
        this.sid=s.sid;
        this.batch=s.batch;
    }
    @Override
    public Student copy() {
        Student s=new Student(this);
        return s;
    }
}
