package afterSchool.ch02;

import java.util.Scanner;

public class 연필분배 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("연필의 개수와 학생의 수를 입력해주세요");
        int n = in.nextInt();
        int s = in.nextInt();
        System.out.println("학생 1명이 받는 연필의 수는 " + (int)n/s + "개이고, 남은 연필의 수는 " + n%s + "개이다.");
    }
}
