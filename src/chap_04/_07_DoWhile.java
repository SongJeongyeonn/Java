package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int hight = 2; // 키 2m
        while(move + hight < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");
        System.out.println(" --- 반복문1 --- ");

        // 키가 엄청나게 큰 사람?
        move = 0;
        hight = 25; // 키가 25m
        while(move + hight < distance) { // 키가 25m기에 조건 불총족으로 실행 X
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문2 --- ");

        // Do While 반복문
        do{
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }while(move + hight < distance);
        System.out.println("도착했습니다.");
    }
}
