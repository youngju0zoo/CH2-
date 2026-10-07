package commerce;

public class CartItem {
    //속
    private Product product;
    private int quantity;  //재고가 아니라 장바구니에 담은 수량

    //생
    public CartItem (Product product) {
        this.product = product;
        this.quantity = 1;
    }
    //기
    public Product getProduct() {
        return this.product;
    }
    public int getQuantity() {
        return this.quantity;
    }

    // 같은 상품을 추가하는 기능
    public void increaseQuantity() {
        quantity++;
    }
    // 키벨류맵구조 생각해보기
}
