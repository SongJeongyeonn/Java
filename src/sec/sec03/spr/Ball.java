package sec.sec03.spr;

import sec.sec02.Circle;

public class Ball extends Circle {
    private String color;

    public Ball(String color){
        this.color = color;
    }

    public void findColor(){
        System.out.println(color + "공이다.");
    }

    public void findArea(){
        findRadius();
        super.findArea(); // 부모메서드의 findArea를 호출한다.
        // super.secret(); 부모메서드의 secret() 메서드가 private로 호출이 불가하다.
        System.out.println("넓이는 4*(π*반지름*반지름)이다.");
    }
    public void findVolume(){
        System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다.");
    }
}
