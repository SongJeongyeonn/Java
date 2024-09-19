package afterSchool.ch02;

import java.util.Scanner;

public class 합 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("세 정수를 입력해주세요");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("세 정수의 합은 " + (a+b+c));
    }
}
