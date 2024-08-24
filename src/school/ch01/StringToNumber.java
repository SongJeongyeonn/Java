package school.ch01;

public class StringToNumber {
    public static void main(String[] args) {
        String strSeven = "7"; // 문자열 변수 생성
        String strPi = "3.14";

        int a = Integer.parseInt(strSeven); // 문자열을 숫자로 변환
        double b = Double.parseDouble(strPi);

        double c = a+b; // 정수와 실수의 덧셈 연산
        System.out.printf("%d + %.2f = %.2f", a, b, c);
    }
}
