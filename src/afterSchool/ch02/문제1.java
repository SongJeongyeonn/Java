package afterSchool.ch02;

import java.util.Scanner;

public class 문제1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("화씨 온도를 입력해주세요 : ");
        double f = in.nextDouble();
        System.out.println("섭씨 온도는 " + (5.0/9.0)*(f-32));
    }
}
