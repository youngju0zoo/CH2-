package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product productA = new Product("아이폰17", 1700000, "애플폰", 50);
        Product productB = new Product("갤럭시S25", 1500000, "안드로이드폰", 70);
        Product productC = new Product("맥북프로", 3800000, "애플노트북", 20);
        Product productD = new Product("에어팟프로", 300000, "무선이어폰", 40);
        List<Product> productList = new ArrayList<>();
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);

        CommerceSystem commerceSystem = new CommerceSystem(productList);
        commerceSystem.start();
    }
}
