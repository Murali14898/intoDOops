package Registry;

public class InStudent extends Student implements Prototype<Student>{
    int psp;
    int rank;
    InStudent(){}
    InStudent(InStudent is){
        super(is);
        this.psp=is.psp;
        this.rank=is.rank;
    }
    @Override
    public InStudent copy() {
        InStudent is=new InStudent(this);
        return is;
    }
}
