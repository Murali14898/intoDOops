package lambdasStreamProject;

public class Coustomer {
    private String cname;
    private String cardNo;
    private String productName;

    public Coustomer(String cname, String cardNo, String productName) {
        this.cname = cname;
        this.cardNo = cardNo;
        this.productName = productName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
