package commerce;

import java.util.List;
import java.util.Scanner;

// List<Product> 보관
// start () - 상품 목록 보여주기, 스캐너, while 반복, 0이면 종료, 선택한 상품 보여주기
public class CommerceSystem {
    // 속
    private List<Category> categories;

    // 생
    public CommerceSystem (List<Category> categories) {
        this.categories = categories;
    }

    // 기
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for(int i=0; i< categories.size(); i++) {
                Category category = categories.get(i);
                System.out.println( (i + 1) + ". "
                        + category.getCategoryName());
            }
            System.out.println("0. 종료    |  프로그램 종료");

            int categoryNum = scanner.nextInt();
            if ( categoryNum >= 1 && categoryNum <= categories.size()) {
                Category category = categories.get(categoryNum - 1);
                List<Product> products = category.getProductList();

                System.out.println(" [ 실시간 커머스 플랫폼 - " + category.getCategoryName() + " ]");
                // 각 리스트마다 순번 나오게 만들기, 1부터 시작
                // 0 입력받고 "커머스 플랫폼을 종료합니다."출력
                for(int i=0; i< products.size(); i++){
                    Product product = products.get(i);
                    System.out.println( (i + 1) + ". "
                            + product.getProductName()
                            + "   |   " + String.format("%,d원", product.getPrice())
                            + "   |   " + product.getExplanation()
                            + "   |   " + product.getStock());
                }
                System.out.println("0. 뒤로가기");
                while (true) {
                    int num = scanner.nextInt();
                    if (num==0) {
                        break;
                    } else if ( num >= 1 && num <= products.size()) {
                        Product product = products.get(num - 1);
                        System.out.println(product);
                        break;
                    }
                }
            } else if ( categoryNum == 0 ) {
                System.out.println(" 커머스 플랫폼을 종료합니다. ");
                return;
            }
        }

    }
    public List<Category> getCategories() {
        return this.categories;
    }
    public void setCategories(List<Category> categories) {
        this.categories=categories;
    }
}
