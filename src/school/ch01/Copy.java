package school.ch01;

public class Copy {
    public static void main(String[] args) {
        String orgin = "가나다라";

        String copy = orgin; // 변수 생성 및 초기화
        System.out.println(copy); // 가나다라 출력

        copy += "마바사"; // 덧셈 연산을 통해 새로운 문자열 생성
        System.out.println(copy); // 출력할 변수명(바뀐 값 "가나다라마바사" 출력됨)
    }
}
