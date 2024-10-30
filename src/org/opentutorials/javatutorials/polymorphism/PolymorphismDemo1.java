package org.opentutorials.javatutorials.polymorphism;

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";} // 클래스 A 메서드 오버라이딩
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B(); // A 타입의 obj를 B로 객체를 만들 수 있는 이유는 상속때문이다.
        A obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}