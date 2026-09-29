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

        System.out.println(" [ 실시간 커머스 플랫폼 - 전자제품 ] ");
        // 각 리스트마다 순번 나오게 만들기, 1부터 시작
        // 0 입력받고 "커머스 플랫폼을 종료합니다."출력
        for(int i=0; i< productList.size(); i++){
            Product product = productList.get(i);
            product.getProductName();
            product.getPrice();
            product.getExplanation();
            product.getStock();
            System.out.println( (i + 1) + ". "
                    + product.getProductName()
                    + "   |   " + product.getPrice() + "원"
                    + "   |   " + product.getExplanation()
                    + "   |   " + product.getStock());
        }
        System.out.println("0. 종료    |  프로그램 종료");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            if (num==0) {
                System.out.println(" 커머스 플랫폼을 종료합니다. ");
                break;
            } else if ( num >= 1 && num < 5) {
                Product product = productList.get(num - 1);
                System.out.println(product);
            }
        }
    }
}
