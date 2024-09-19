package afterSchool.ch02;

import java.util.Scanner;
public class EvenTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int number = in.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " : 입력한 수는 짝수입니다.");
        } else {
            System.out.println(number + " : 입력한 수는 홀수입니다.");
        }
    }
}
