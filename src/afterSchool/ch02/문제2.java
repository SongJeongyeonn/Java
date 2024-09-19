package afterSchool.ch02;

import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("두 정수를 입력해주세요 : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("두 정수의 합은 " + (a+b));
        in.close();
    }
}
