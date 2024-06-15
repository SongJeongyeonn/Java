package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
    static int i = 5; // 전역변수
    static void a(){
        int i = 10; // 지역변수
        b();
    }
    static void b(){
        int i = 30;
        System.out.println(i); // 지역변수와 전역변수를 둘 다 사용 가능할 때는 지역변수가 사용된다.
    }

    public static void main(String[] args) {
        a();
    }
}
