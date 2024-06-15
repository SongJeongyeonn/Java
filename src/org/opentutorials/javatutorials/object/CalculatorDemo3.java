package org.opentutorials.javatutorials.object;
// CalculatorDemo2에 평균을 내는 기능을 추가
public class CalculatorDemo3 {
    public static void avg(int left, int right){
        System.out.println((left + right) /2);
    }
    public static void sum(int left, int right){
        System.out.println(left + right);
    }
    public static void main(String[] args) {
        // 1
        int left = 10;
        int right = 20;
        sum(left, right);
        avg(left, right);
        // 2
        left = 20;
        right = 40;
        sum(left, right);
        avg(left, right);
    }
}
