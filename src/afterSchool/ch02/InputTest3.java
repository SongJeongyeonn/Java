package afterSchool.ch02;

import java.util.Scanner;

public class InputTest3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int number = in.nextInt();
            System.out.println(number);
        } catch(Exception e) {
            System.out.println("정수만 입력하셔야합니다.");
        }
    }
}
