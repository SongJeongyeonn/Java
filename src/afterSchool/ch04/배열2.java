package afterSchool.ch04;

import java.util.Scanner;

public class 배열2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[6];
        for(int i = 0; i < 6; i++) {
            num[i] = in.nextInt();
            System.out.println(num[i]);
        }
    }
}
