package afterSchool.ch02;

import java.util.Scanner;

public class InputTest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = in.next();
        if(name.length() < 10)
            System.out.println("어서오세요 " + name + "님");
        else
            System.out.println("10글자 이상입니다.");
    }
}
