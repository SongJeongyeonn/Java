package afterSchool.ch05;

public class DrinkMachineTest {
    public static void main(String[] args) {
        // 객체생성
        DrinkMachine m1 = new DrinkMachine();
        DrinkMachine m2 = new DrinkMachine();
        // 음료뽑기
        m1.pushButton(1);
        m2.pushButton(2);
        // 음료확인
        m1.printOutput();
        m2.printOutput();
    }
}
