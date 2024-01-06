package casting;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCount = 10;
        String [] product = new String[maxCount];
        int [] price = new int[maxCount];
        int priceCount = 0;

        while (true) {
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료\n 메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine(); //
            if (menu == 1) {

                if (priceCount >= 10) {
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.println("상품명을 등록 해주세요");
                product[priceCount] = scanner.nextLine();

                System.out.println("가격을 입력해 주세요");
                price[priceCount] = scanner.nextInt();

                priceCount++;
            }
            else if (menu == 2) {
                if (priceCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }
                for (int i = 0; i < priceCount; i++) {
                    System.out.println("상품명 : " + product[i] + "가격 : " + price[i] + "원" );
                }
            }

            else if (menu == 3) {
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println("정확한 번호를 입력해 주세요!");
                continue;

            }
        }
    }
}
