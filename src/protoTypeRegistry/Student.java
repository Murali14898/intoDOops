package protoTypeRegistry;

public class Student implements Prototype<Student>{
    private String name;
    private String batch;
    public Student(){

    }
    public Student(Student s){
        this.name=s.name;
        this.batch=s.batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setNams(String name) {
        this.name = name;
    }
    @Override
    public Student copy() {
        Student s=new Student(this);
        return s;
    }
}
