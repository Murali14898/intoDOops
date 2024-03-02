package protoTypeRegistry;

public class InteliStudent extends Student implements Prototype<Student>{
    private int psp;
    private int rank;
    public InteliStudent(){
        super();
    }
    public InteliStudent(InteliStudent is){
        super(is);
        this.psp=is.psp;
        this.rank=is.rank;
    }
    @Override
    public InteliStudent copy() {
        InteliStudent is1=new InteliStudent(this);
        return is1;
    }
}
