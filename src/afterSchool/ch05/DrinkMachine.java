package afterSchool.ch05;

public class DrinkMachine {
    String output; // 클래스 스코프
    void pushButton(int num){ // 메서드 스코프
        String[] drinks = {"콜라", "사이다", "환타"};// 메서드 스코프
        output = drinks[num];
    }
    void printOutput(){
        System.out.println(output);
    }
}
