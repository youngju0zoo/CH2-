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

        Product productE = new Product("나이키", 120000, "바지", 72);
        Product productF = new Product("아디다스", 89000, "반팔티셔츠", 87);
        Product productG = new Product("뉴발란스", 109000, "신발", 51);
        Product productH = new Product("아식스", 49000, "모자", 11);

        Product productI = new Product("새우깡", 1500, "손이가요손이가", 24);
        Product productJ = new Product("김치", 9900, "반찬", 8);
        Product productK = new Product("만두", 3000, "냉동식품", 57);
        Product productL = new Product("팝콘", 2000, "영화관필수", 94);

        List<Category> categoryList = new ArrayList<>();

        categoryA.addProduct(productA);
        categoryA.addProduct(productB);
        categoryA.addProduct(productC);
        categoryA.addProduct(productD);
        categoryList.add(categoryA);

        categoryB.addProduct(productE);
        categoryB.addProduct(productF);
        categoryB.addProduct(productG);
        categoryB.addProduct(productH);
        categoryList.add(categoryB);

        categoryC.addProduct(productI);
        categoryC.addProduct(productJ);
        categoryC.addProduct(productK);
        categoryC.addProduct(productL);
        categoryList.add(categoryC);

        Cart cart = new Cart();
        CommerceSystem commerceSystem = new CommerceSystem(categoryList, cart);
        commerceSystem.start();
    }
}