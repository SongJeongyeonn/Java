package school.ch01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String y = in.next();
        System.out.printf("%s의 학번은 %d이다.", y, n);
    }
}
