package afterSchool.ch03;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("시간을 입력해주세요: ");
        int hour = in.nextInt();
        int test = hour <= 10 ? hour * 100 : hour;
        String ampm = hour < 12 ? "오전" : "오후";
        System.out.println("[2]" + test);
        System.out.println("[3]" + ampm);
    }
}
