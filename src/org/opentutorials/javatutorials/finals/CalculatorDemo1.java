package org.opentutorials.javatutorials.finals;

class Calculator {
    static final double PI = 3.14; // PI는 공통적으로 쓰이므로 바뀌면 안된다.
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10; final로 고정되어있어 변경이 불가하다.


    }
}