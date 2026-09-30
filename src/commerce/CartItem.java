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
}
