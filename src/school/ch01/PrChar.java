package school.ch01;
/*
 * char 타입과 아스키코드, 산술연산자 + 실습
 * 파일명: PrChar.java
 * 실제 출력 값: ch1: 0, ch2: 1, ch1 + ch2: a (/은 줄바꿈이다.)
 */
public class PrChar {
    public static void main(String[] args) {
        char ch1 = 48;
        char ch2 = 49;
        System.out.printf("ch1: %c, ch2: %c, ch1 + ch2: %c\n", ch1, ch2, ch1+ch2);
    }
}
