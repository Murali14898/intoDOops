package builderDesignPatteren;

public class Student {
    private String sid;
    private String name;
    private double psp;
    private String batchId;
//    public Student(StudentHelper sh){
//        this.sid=sh.sid;
//        this.name=sh.name;
//    }

    private Student(StudentHelper sh){
        this.sid=sh.sid;
        this.name=sh.name;
    }
    public static StudentHelper getInstance(){
        return new StudentHelper();
    }
    static class StudentHelper {
        String sid;
        String name;
        double psp;
        String batchId;

        public StudentHelper setSid(String sid) {
            this.sid = sid;
            return this;
        }

        public StudentHelper setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentHelper setName(String name) {
            this.name = name;
            return this;
        }

        public StudentHelper setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
