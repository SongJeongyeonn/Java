package school.ch01;

import java.util.Random;

public class exam4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(11 - 8 + 1) + 8;
        System.out.printf("[현재시간: %d시]\n", a);
        switch(a) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            case 11:
                System.out.println("외근을 나갑니다.");
        }
    }
}
