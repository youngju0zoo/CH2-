package commerce;

public class Customer {
    // 속 (고객명, 이메일, 등급)
    private String customerName;
    private String customerEmail;
    private String customerGrade;
    // 생
    public Customer (String customerName, String customerEmail,String customerGrade) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerGrade = customerGrade;
    }
    // 기
    public String getCustomerName() {
        return this.customerName;
    }
    public String getCustomerEmail() {
        return this.customerEmail;
    }
    public String getCustomerGrade() {
        return this.customerGrade;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
