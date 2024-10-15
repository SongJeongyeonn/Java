package school.exam1;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        double a = in.nextDouble();
        System.out.print("두 번째 수: ");
        double b = in.nextDouble();
        System.out.println("---------------------");
        if(b != 0)
            System.out.printf("결과: %.2f", a/b);
        else
            System.out.println("결과: 무한대");
    }
}
