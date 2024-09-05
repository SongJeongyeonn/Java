package school.ch01;
// 윤년의 조건이 4의 배수이면서 100의 배수0가 아니거나 1000의 배수인 경우라고 하자
public class LeapYear {
    public static void main(String[] args) {
        System.out.printf("2020년은 윤년입니까? %b\n", isLeapYear(2020));
        System.out.printf("1900년은 윤년입니까? %b\n", isLeapYear(1900));
        System.out.printf("2000년은 윤년입니까? %b\n", isLeapYear(2000));
    }
    public static boolean isLeapYear(int n) {
        return  (n % 4 == 0 && n % 100 != 0) ? true: (n % 1000 == 0) ? true:false;
    }
}
