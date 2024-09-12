package org.opentutorials.javatutorials.variables;

public class IntergerDemo {
    public static void main(String[] args) {
        int a;
        a = 1;
        System.out.println(a+1); // 2
        a = 2;
        System.out.println(a+1); // 3
        //int  b =  2147483648 // 데이터 타입에 따라 범위가 다르다.
        long b = 2147483648L; // l을 붙여야 한다.
        byte c = 100; // 뒤에 B를 붙이지 않으면 int형으로 사용된다.(byte와 short는 뒤에 뭐를 안 붙여도 괜찮다.)
    }
}
