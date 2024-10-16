package afterSchool.ch04;

import java.util.Scanner;

public class 다중배열2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("행의 갯수를 입력하고 [Enter] 치세요 = ");
        int n1 = in.nextInt();
        System.out.print("열의 갯수를 입력하고 [Enter] 치세요 = ");
        int n2 = in.nextInt();

        // in.nextLine(); 문자열 배열을 nextLine으로 입력받을 시 버퍼에 남은 개행문자 비우기
        char[][] num = new char[n1][n2];
        String[] str = new String[n1];

        for(int i = 0; i < n1; i++) {
            System.out.printf("%d번째 행에 입력할 문자%d개를 차례대로 입력하고 [Enter] 치세요 = ",i+1, n2);
            str[i] = in.next();
            for(int j = 0; j < n2; j++) {
                    num[i][j] = str[i].charAt(j); // i번째 문장의 j에 있는 값을 하나씩 가져와서 넣어준다.
            }
        }
        System.out.println("------------------------------");
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}
