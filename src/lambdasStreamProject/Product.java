package lambdasStreamProject;

public class Product extends Merchant{
    private String pId;
    private String pName;
    private int price;
    public Product(String pId, String pName, int price) {
        super(101,"Trends");
        this.pId = pId;
        this.pName = pName;
        this.price = price;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
