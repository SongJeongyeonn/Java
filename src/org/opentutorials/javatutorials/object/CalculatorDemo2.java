package org.opentutorials.javatutorials.object;
// CalculatorDemo Refactoring → 같은 기능들을 묶어, 가독성 향상 및 메소드만 고치면 이 메소드를 사용하는 모든 코드의 결과가 바뀌기에 편의성 향상
public class CalculatorDemo2 {
    public static void sum(int left, int right) {
        System.out.println(left+right);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(20, 40);
    }
}
