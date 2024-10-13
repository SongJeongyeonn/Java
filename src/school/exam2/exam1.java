package school.exam2;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []array = new int[5]; // 배열 선언과 동시에 배열 객체 생성
        int sum = 0;
        for(int i = 0; i < array.length; i++) { // 키보드에서 입력받은 정수를 배열에 대입
            array[i] = in.nextInt();
        }
        for(int i = 0; i <array.length; i++) { // 배열에 저장된 정수값을 모두 더한다.
            sum += array[i];
        }
        System.out.println("평균 = " + sum / 5.0);
    }
}
