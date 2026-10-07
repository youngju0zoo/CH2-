package commerce;

import java.util.List;
import java.util.Scanner;

// List<Product> 보관
// start () - 상품 목록 보여주기, 스캐너, while 반복, 0이면 종료, 선택한 상품 보여주기
public class CommerceSystem {
    // 속
    private List<Category> categories;
    private Cart cart;

    // 생
    public CommerceSystem(List<Category> categories, Cart cart) {
        this.categories = categories;
        this.cart = cart;
    }

    // 기
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i < categories.size(); i++) {
                Category category = categories.get(i);
                System.out.println((i + 1) + ". "
                        + category.getCategoryName());
            }
            System.out.println("0. 종료    |  프로그램 종료");

            if (!cart.isEmpty()) {
                System.out.println();
                System.out.println("[ 주문 관리 ]");
                System.out.println("4. 장바구니 확인    | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. 주문 취소       | 진행중인 주문을 취소합니다.");
            }

            int categoryNum = scanner.nextInt();
            if (categoryNum >= 1 && categoryNum <= categories.size()) {
                Category category = categories.get(categoryNum - 1);
                List<Product> products = category.getProductList();

                System.out.println(" [ 실시간 커머스 플랫폼 - " + category.getCategoryName() + " ]");
                // 각 리스트마다 순번 나오게 만들기, 1부터 시작
                // 0 입력받고 "커머스 플랫폼을 종료합니다."출력
                for (int i = 0; i < products.size(); i++) {
                    Product product = products.get(i);
                    System.out.println((i + 1) + ". "
                            + product.getProductName()
                            + "   |   " + String.format("%,d원", product.getPrice())
                            + "   |   " + product.getExplanation()
                            + "   |   " + product.getStock());
                }
                System.out.println("0. 뒤로가기");
                while (true) {
                    int num = scanner.nextInt();
                    if (num == 0) {
                        break;
                    } else if (num >= 1 && num <= products.size()) {
                        Product product = products.get(num - 1);
                        System.out.println(product);
                        System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
                        System.out.println("1. 확인     2. 취소");
                        while (true) {
                            int cartChoice = scanner.nextInt();
                            if (cartChoice == 1) {
                                if (product.getStock() > 0) {
                                    CartItem cartItem = new CartItem(product);
                                    boolean isAdded = cart.addCartItem(cartItem);
                                    if (isAdded == true) {
                                        System.out.println(product.getProductName() + "가 장바구니에 추가되었습니다.");
                                    } else {
                                        System.out.println("현재 남아있는 재고가 부족합니다.");
                                    }
                                    break;
                                } else {
                                    System.out.println("현재 재고가 남아있지 않습니다.");
                                    break;
                                }
                            } else if (cartChoice == 2) {
                                System.out.println("취소되었습니다.");
                                break;
                            } else {
                                System.out.println("유효하지 않은 번호입니다. 다시 입력해주세요.");
                            }
                        }
                        break;
                    } else {
                        System.out.println("유효하지 않은 상품 번호입니다. 다시 입력해주세요.");
                    }
                }
            } else if (categoryNum == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                return;
            } else if (categoryNum == 4 && !cart.isEmpty()) {
                System.out.println("아래와 같이 주문 하시겠습니까?");
                cart.checkCartItem();
                System.out.println("1. 주문 확정      2. 메인으로 돌아가기");
                int orderChoice = scanner.nextInt();
                if (orderChoice == 1) {
                    int totalPrice = cart.getTotalPrice();
                    System.out.println("주문이 완료되었습니다! 총 금액: "
                            + String.format("%,d원", totalPrice));
                    cart.completeOrder();
                } else if (orderChoice == 2) {
                    System.out.println("메인으로 돌아갑니다.");
                } else {
                    System.out.println("유효하지 않은 번호입니다.");
                }

            } else if (categoryNum == 5 && !cart.isEmpty()) {
                cart.clearCart();
                System.out.println("주문이 취소되었습니다.");
            } else {
                System.out.println("유효하지 않은 카테고리 번호입니다. 다시입력해주세요.");
            }
        }
    }
        public List<Category> getCategories () {
            return this.categories;
        }
        public void setCategories (List < Category > categories) {
            this.categories = categories;
        }
    }
