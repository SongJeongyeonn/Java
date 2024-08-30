package school.ch01;
/*
 * char 타입과 String 타입, 산술연산자 + 실습
 * 파일명: PrCharlntString.java
 * 실제 출력 값 : 012 / 012 / 03 / 03 / 123 / 123 (/은 줄바꿈이다.)
 */
public class PrCharlntString {
    public static void main(String[] args) {
        char ch = '0';
        String str = "12";
        int i = 3;

        System.out.println(ch + str); // 문자열과 문자를 이어주었다.
        System.out.printf("%s\n", ch + str);
        System.out.println(ch + i);
        System.out.printf("%s\n", ch + i);
        System.out.println(str+i);
        System.out.printf("%s\n", str+i);
    }
}
