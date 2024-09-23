package afterSchool.ch03;

import java.util.Scanner;

public class If_elseif_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("영어 점수를 입력해주세요: ");
        int eng = in.nextInt();

        if(eng >= 90) {
            System.out.println("A학점입니다.");
            System.out.println("축하해요~");
        }
        else if(eng >= 80)
            System.out.println("B학점입니다.");
        else if(eng >= 70)
            System.out.println("C학점입니다.");
        else
            System.out.println("D학점입니다.");
    }
}
