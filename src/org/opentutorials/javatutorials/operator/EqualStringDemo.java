package org.opentutorials.javatutorials.operator;

public class EqualStringDemo {
    public static void main(String[] args) {
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b)); // 값을 비교
    }
}
