package commerce;
// 개별 상품을 관리하는 클래스. 현재는 전자제품만 관리함
public class Product {
    // 속성 - 제품명, 가격, 설명, 재고수량
    private String productName;
    private int price;
    private String explanation;
    private int stock;

    // 생성자
    public Product (String productName, int price, String explanation, int stock) {
        this.productName = productName;
        this.price = price;
        this.explanation = explanation;
        this.stock = stock;
    }

    // 기능
    public String getProductName() {
        return this.productName;
    }
    public int getPrice() {
        return this.price;
    }
    public String getExplanation(){
        return this.explanation;
    }
    public int getStock() {
        return this.stock;
    }
    @Override
    public String toString() {
        return "선택한 상품: " + productName
                + "   |   " + String.format("%,d원", price)
                + "   |   " + explanation
                + "   |   " + stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
