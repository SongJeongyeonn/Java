package afterSchool.ch03;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        System.out.println("몇 대인지 입력해주세요(19살, 10대)");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        switch(age) {
            case 10 ->
                    System.out.println(age + "대입니다. 참고서 코너는 A구역입니다.");
            case 20 ->
                    System.out.println(age + "대입니다. 참고서 코너는 B구역입니다.");
            case 30 ->
                    System.out.println(age + "대입니다. 참고서 코너는 C구역입니다.");
            case 40 ->
                    System.out.println(age + "입니다. 참고서 코너는 D구역입니다.");
            default ->
                    System.out.println(age + "입니다. 참고서 코너는 F구역입니다.");
        }
    }
}
