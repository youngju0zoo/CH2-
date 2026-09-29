package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //카테고리
        Category categoryA = new Category("전자제품");
        Category categoryB = new Category("의류");
        Category categoryC = new Category("식품");

        Product productA = new Product("아이폰17", 1700000, "애플폰", 50);
        Product productB = new Product("갤럭시S25", 1500000, "안드로이드폰", 70);
        Product productC = new Product("맥북프로", 3800000, "애플노트북", 20);
        Product productD = new Product("에어팟프로", 300000, "무선이어폰", 40);
        List<Category> categoryList = new ArrayList<>();

        categoryA.addProduct(productA);
        categoryA.addProduct(productB);
        categoryA.addProduct(productC);
        categoryA.addProduct(productD);
        categoryList.add(categoryA);

        CommerceSystem commerceSystem = new CommerceSystem(categoryList);
        commerceSystem.start();
    }
}