package sccaner;

import java.util.Scanner;

public class scanner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("숫자를 입력하세요 : ");
            int num = scanner.nextInt();

            if(num == 0){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
