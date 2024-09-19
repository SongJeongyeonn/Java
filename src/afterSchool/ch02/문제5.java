package afterSchool.ch02;

import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("두 수를 입력해주세요 : ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("두 수의 곱은 " + a*b);
    }
}
