package afterSchool.ch03;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        String name = "미성년자";
        if(age >= 20)
            name = "성인";
        System.out.println(name);
    }
}
