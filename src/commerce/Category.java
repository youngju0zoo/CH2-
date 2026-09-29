package commerce;

import java.util.ArrayList;
import java.util.List;

public class Category {
    // 속성 - 카테고리와 product리스트
    private String categoryName;
    private List<Product> productList;

    // 생성자
    public Category (String categoryName) {
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
    }

    // 상품 추가 기능
    public void addProduct (Product product) {
        productList.add(product);
    }
    // 카테고리 이름 반환
    public String getCategoryName() {
        return this.categoryName;
    }
    // 제품목록
    public List<Product> getProductList() {
        return this.productList;
    }
}
