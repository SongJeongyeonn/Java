package afterSchool.ch02;

import java.util.Scanner;

public class IfTest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int number = in.nextInt();

        if(number >= 10)
            System.out.println("입력한 숫자는 10이상입니다.");
    }
}
