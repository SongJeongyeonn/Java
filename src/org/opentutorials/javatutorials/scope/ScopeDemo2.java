package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i; // 전역변수(globals variables)
    static void a(){
        i = 0;
    }

    public static void main(String[] args) {
        for(i = 0; i < 5; i++){ // 무한 루프가 된다.
            a(); // 계속 값을 0으로 만들기 때문에, 조건에 벗어나지 않는다.
            System.out.println(i);
        }
    }
}
