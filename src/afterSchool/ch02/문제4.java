package afterSchool.ch02;

import java.util.Scanner;

public class 문제4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("삼각형의 밑변과 높이를 입력해주세요 : ");
        double l1 = in.nextDouble();
        double l2 = in.nextDouble();
        System.out.println("삼각형의 넓이 : " + l1*l2/2);
        in.close();
    }
}
