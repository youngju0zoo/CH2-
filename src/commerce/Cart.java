package commerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // 속
    private List<CartItem> cartItemList;

    // 생
    public Cart() {
        this.cartItemList = new ArrayList<>();
    }

    // 기
    public List<CartItem> getCartItemList() {
        return this.cartItemList;
    }

    // 장바구니 상품 추가
    public boolean addCartItem(CartItem cartItem) {
        for (CartItem item : cartItemList) {
            if (item.getProduct() == cartItem.getProduct()) {
                if (item.getQuantity() < item.getProduct().getStock()) {
                    item.increaseQuantity();
                    return true;
                }
                return false;
            }
        }
        cartItemList.add(cartItem);
        return true;
    }

    // 장바구니 상품을 확인하는 기능
    public void checkCartItem() {
        System.out.println("[ 장바구니 내역 ]");
        for (CartItem item : cartItemList) {
            Product product = item.getProduct();
            System.out.println(product.getProductName()
                    + " | " + String.format("%,d원", product.getPrice())
                    + " | " + product.getExplanation()
                    + " | 수량: " + item.getQuantity() + "개");
        }
        System.out.println(" [ 총 주문 금액 ] ");
        System.out.println(String.format("%,d원", getTotalPrice()));
    }

    // 장바구니 리스트가 비어있는지
    public boolean isEmpty() {
        return cartItemList.isEmpty();
    }

    // 주문금액 계산 후 반환
    public int getTotalPrice() {
        int totalPrice = 0;
        for (CartItem item : cartItemList) {
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    // 주문완료 기능
    public void completeOrder() {
        for (CartItem item : cartItemList) {
            Product product = item.getProduct();
            int beforeStock = product.getStock();
            product.decreaseStock(item.getQuantity());
            System.out.println(product.getProductName()
                    + " 재고가 " + beforeStock
                    + "개 → " + product.getStock()
                    + "개로 업데이트되었습니다.");
        }
        cartItemList.clear();
    }
    // 주문 취소 시 장바구니 비우기
    public void clearCart() {
        cartItemList.clear();
    }
}
