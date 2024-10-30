package org.opentutorials.javatutorials.interfaces.example1;

class CalculatorDummy{ // 모조 클래스 (진짜 클래스가 완성되기 전에 사용)
    public void setOprands(int first, int second, int third){} // 구체적인 내용이 없다.
    public int sum(){
        return 60; // 반환값도 고정적이다.
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}