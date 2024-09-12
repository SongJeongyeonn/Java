package org.opentutorials.javatutorials.condition;

public class Condition4Demo {
    public static void main(String[] args) {
        if(false){
            System.out.println(1);
        } else if(true){
            System.out.println(2);
        } else if(true){
            System.out.println(3); // 이미 위의 조건에 맞아 한번 실행되었기에 이 코드는 실행되지 않는다.
        } else {
            System.out.println(4);
        }
    }
}
