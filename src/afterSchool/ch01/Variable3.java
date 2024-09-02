package afterSchool.ch01;

public class Variable3 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);

        number = 30;
        number = number * 100000000; // 오버 플로우 발생
        System.out.println(number);
    }
}
