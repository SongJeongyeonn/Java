package chap.chap_06;
// 메소드 : 기능하는 코드들의 묶음
public class _01_Method {
    // 메소드 정의
    public static void sayHello(){ // 메소드 이름에는 동사를 많이 사용한다.

        System.out.println("안녕하세요? 메소드입니다.");
    }
    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("매소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("매소드 호출 후");
    }
}
