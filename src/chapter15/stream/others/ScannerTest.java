package chapter15.stream.others;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = scanner.nextLine();
        System.out.println("숫자를 입력해주세요");
        int num = scanner.nextInt();
        System.out.println();
        System.out.println("===입력된 정보===");
        System.out.println(name);
        System.out.println(num);


    }
}
