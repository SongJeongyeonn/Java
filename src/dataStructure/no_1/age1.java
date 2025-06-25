package dataStructure.no_1;
import java.util.Scanner;

public class age1 {
    public static void main(String[] args) {
        System.out.println("A씨의 나이가 20살 이상 36살 미만인 경우의 이진 탐색을 통한 답 \n");
        Scanner sc = new Scanner(System.in);
        int start = 20; int end = 36; int age = 0;
        while(true){
            age = (start+end)/2;
            if(end - start <= 1){
                System.out.printf("당신의 나이는 %d 입니다!", age);
                break;
            }
            System.out.printf("당신의 나이는 %d 미만 인가요? \n 네: 1 / 아니요: 2", age);
            int answer = sc.nextInt();
            if(answer == 1){
                end = age;
            } else{
                start = age;
            }
        }
    }
}
