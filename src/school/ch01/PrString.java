package school.ch01;
/*
 * String 타입, 비교연산자 = 실습
 * 파일명: PrString.java
 * 실제 출력 값: false / true / true / true / 안녕하세요 / false
 */
public class PrString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "안녕하세요";

        System.out.printf("%b\n", s1 == "안녕하세요"); // 형식 문자가 불리안이므로 조건식이 맞으면 true 아니면 false
        System.out.printf("%b\n", s2 == "안녕하세요");

        s1 = "안녕하세요";
        System.out.printf("%b\n", s1 == s2);

        String s3 = "안녕하세요";
        String s4 = "안녕";

        System.out.printf("%b\n", s1 == s3);
        System.out.println(s4 + "하세요"); // 문자열 출력이다.
        System.out.printf("%b\n", s3 == s4 + "하세요");
    }
}
