package afterSchool.ch02;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = in.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = in.nextInt();

        if(num1 + num2 >= 20) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + " [두 수의 합은 20을 넘습니다.]");
        } else {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + " [두 수의 합은 20을 넘지 않습니다.]");
        }
    }
}
