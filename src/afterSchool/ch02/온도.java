package afterSchool.ch02;

import java.util.Scanner;

public class 온도 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("화씨를 입력해주세요");
        double f = in.nextDouble();
        f = 5 * (f-31) / 9;
        System.out.println("섭씨 온도는 " + f);
        if(f >= 30)
            System.out.println("더워요");
        else if(f <= 10)
            System.out.println("추워요");
    }
}
