package afterSchool.ch02;

import java.util.Scanner;

public class IFTest4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if(number % 2 == 0) {
            System.out.println("2의 배수입니다.");
        } else {
            System.out.println("3의 배수도, 2의 배수도 아닙니다.");
        }
    }
}
