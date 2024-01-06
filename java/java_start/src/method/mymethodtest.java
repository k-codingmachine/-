package method;

import java.util.Scanner;

public class mymethodtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nowprice = 10000;
        while (true) {
            System.out.println("1. 입금 || 2. 출금 || 3. 잔액확인 4. 프로그램 종료");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.println("입금할 금액을 입력해주세요");
                int addprice = scanner.nextInt();
                int total = add(nowprice, addprice);
                System.out.println("총 금액은 : " + total);
            }
            if (num == 2) {
                System.out.println("출금할 금액을 입력하세요");
                int minusprice = scanner.nextInt();
                if (nowprice >= minusprice) {
                    int total = minus(nowprice, minusprice);
                    System.out.println("남은 금액은 : " + total);
                }else {
                    System.out.println("금액이 부족합니다.");
                    continue;
                }
            }
            if (num == 3) {
                System.out.println("잔액은 : " + nowprice);
            }
            if (num == 4) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    public static int add(int nowprice, int addprice) {
        nowprice += addprice;
        return nowprice;
    }

    public static int minus(int nowprice, int minusprice) {
        nowprice -= minusprice;
        return nowprice;
    }

}
