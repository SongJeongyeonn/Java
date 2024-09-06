package school.ch01;
import java.util.Scanner;
public class CoffeeBeanC {
    public static void main(String[] args) {
        System.out.print("입력: ");
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        int big = l1 > l2 ? l1 > l3 ? l1 : l3 : l2 > l3 ? l2 : l3;
        int sum = l1+l2+l3;
        System.out.printf("합: %d cm, 배송: %s", sum, chcekParceIPackage(big, sum));
    }
    public static String chcekParceIPackage(int a, int b) {
        return a <= 80 && b <= 150 ? "가능" : "불가능";
    }
}
