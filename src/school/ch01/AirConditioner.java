package school.ch01;

public class AirConditioner {
    public static void main(String[] args) {
        turnOn(30);
        turnOn(19);
    }
    // 입력된 현재 온도를 기준 삼아, 에어컨 가동 문구를 출력
    public static void turnOn(int temperature) { // 메소드 정의부
        if(temperature > 25)
            System.out.printf("현재 온도 %d, 에어컨을 가동합니다.\n", temperature);
        if(temperature <= 20)
            System.out.printf("에어컨 가동을 종료합니다.");
    }
}
