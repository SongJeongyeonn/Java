package org.opentutorials.javatutorials.abstractclass.example2;
abstract class A{
    public abstract int b();
    public void d(){
        System.out.println("world");
    }
}
class B extends A{
    public int b(){return 1;} // A 클래스에서 b 메서드가 추상 메서드로, 오버라이딩을 해야 사용할 수 있다.
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}