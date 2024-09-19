package afterSchool.ch02;

import java.util.Scanner;

public class 문제7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("반지름을 입력해주세요 : ");
        double r = in.nextDouble();
        System.out.println("원의 넓이는 " + Math.PI*r);
    }
}
