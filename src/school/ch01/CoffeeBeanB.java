package school.ch01;
import java.util.Scanner;

/*
 * 낵배 보내기
 * 파일명: CoffeeBeanB.java
 */
public class CoffeeBeanB {
    public static void main(String[] args) {
        System.out.print("입력: ");
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        int big = l1 > l2 ? l1 > l3 ? l1 : l3 : l2 > l3 ? l2 : l3;
        int sum = l1+l2+l3;
        boolean available = (big <= 80 && sum <= 150);
        System.out.printf("합: %d cm, 배송: %s", sum, available ? "가능" : "불가능");
    }
}
