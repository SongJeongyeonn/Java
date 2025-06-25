package dataStructure.no_1;
import java.util.Scanner;

public class age2 {
    public static void main(String[] args) {
        System.out.println("해당 범위는 선형 탐색버으로 몇 번만에 찾을 수 있을지 알아보겠습니다!");
        System.out.println("space bar로 한 칸을 띄고 범위가 될 숫자 2개를 입력해주세요 (ex. \"1 6\")");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt()+sc.nextInt();
        int cnt = 0;
        while(sum /2 > 0){
            sum /= 2;
            cnt++;
        }
        System.out.printf("총 %d 번 하였습니다.", cnt);
    }
}
