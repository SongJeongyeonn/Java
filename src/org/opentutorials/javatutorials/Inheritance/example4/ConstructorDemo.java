package org.opentutorials.javatutorials.Inheritance.example4;

public class ConstructorDemo {
    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo(); // 자동으로 생성자를 만들어 준다.
    }
}
/* 에러 발생 코드
package org.opentutorials.javatutorials.Inheritance.example4;

public class ConstructorDemo {
    public ConstructorDemo(int param1){} // 선언된 생성자에 매개변수가 있기 때문이다.(기본 생성자 X)
    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo(); // 인수가 없기 때문이다.
    }
}
 */
