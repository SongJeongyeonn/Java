package afterSchool.ch02;

import java.util.Scanner;

public class IfTest5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        System.out.println("입력한 이름 : " +  name);
        System.out.println("이름의 길이 : " + name.length());
    }
}
