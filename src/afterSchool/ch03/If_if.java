package afterSchool.ch03;

import java.util.Scanner;

public class If_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("국어, 영어, 수학 점수를 입력해주세요: ");
        int kor = in.nextInt();
        int eng = in.nextInt();
        int mat = in.nextInt();
        int total_score  = kor + eng + mat;

        if(kor >= 95 && eng > 90 && mat >90) {
            if(total_score == 300)
                System.out.println("만점 입니다!!");
            else
                System.out.println("잘하셨습니다.");
        }
        else {
            if(total_score >= 180)
                System.out.println("매우 노력하세요, 재수강 대상자는 아닙니다.");
            else
                System.out.println("매우 노력하세요, 재수강 대상자입니다.");
        }
    }
}
