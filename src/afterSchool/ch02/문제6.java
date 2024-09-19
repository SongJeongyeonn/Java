package afterSchool.ch02;

import java.util.Scanner;

public class 문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("이름과 나이를 입력해주세요 : ");
        String name = in.next();
        int age = in.nextInt();
        System.out.println("내 이름은 " + name + ", 나이는 " + age);
    }
}
