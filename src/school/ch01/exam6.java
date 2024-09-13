package school.ch01;

import java.util.Scanner;

public class exam6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("전공 이수 학점: ");
        int majorCredits = in.nextInt();
        System.out.print("교양 이수 학점: ");
        int liberalCredits = in.nextInt();
        System.out.print("일반 이수 학점: ");
        int generalCredits = in.nextInt();
        if((majorCredits >= 70) && (majorCredits + generalCredits + liberalCredits >= 140)) {
            if((liberalCredits + generalCredits >= 80) || (liberalCredits >= 30 && generalCredits >= 30)) {
                System.out.println("졸업가능");
            }
            else
                System.out.println("졸업불가능");
        }
        else
            System.out.println("졸업불가능");
    }
}
