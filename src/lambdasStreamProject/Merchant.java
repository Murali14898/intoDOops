package lambdasStreamProject;

public class Merchant {
    private int mId;
    private String Name;


    public Merchant(int mId, String name) {
        this.mId = mId;
        this.Name = name;
    }

    public int getmId() {
        return mId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
