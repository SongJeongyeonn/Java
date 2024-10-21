package sec.sec02;

import sec.sec03.spr.Ball;

public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Ball c2 = new Ball("빨간색"); // sec03의 Ball을 사용하면 오버라이딩의 결과를 얻을 수 있다.

        System.out.println("원 :");
        c1.findRadius();
        c1.findArea();

        System.out.println("공 :");
        c2.findRadius();
        c2.findColor();
        c2.findArea(); // 상속된 메서드 호출에 의한 잘못된 결과이다.
        c2.findVolume();
    }
}
