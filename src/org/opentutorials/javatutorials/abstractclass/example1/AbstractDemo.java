package org.opentutorials.javatutorials.abstractclass.example1;
abstract class A{ // 추상 클래스 A
    public abstract int b(); // 추상메서드는 본체가 없다.(사용을 위해서는 )
    /* 본체가 있는 메서드는 abstract 키워드를 가질 수 없다.
    public abstract int c() {System.out.println("Hello")}  메서드의 구체적인 로직이 담겨있으므로 abstract로 사용 불가
    추상 클래스 내에는 추상 메서드가 아닌 메서드가 존재할 수 있다.
     */
    public void d(){
        System.out.println("world");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A();  abstract 클래스로 인스턴스화 할 수 없다.
    }
}