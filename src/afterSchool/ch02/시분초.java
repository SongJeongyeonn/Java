package afterSchool.ch02;

import java.util.Scanner;

public class 시분초 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("초단위로 시간을 입력해주세요");
        int time = in.nextInt();
        System.out.println((int)(time/3600) + "시간 " + (int)time/600 + "분 " + time%60 + "초");
    }
}
