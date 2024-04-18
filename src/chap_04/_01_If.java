package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오전 10시

        // if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if (hour < 14)
            System.out.println("녹차 라떼 +1");

        // if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
        if (hour < 14) {
            System.out.println("녹차 라떼 +1");
            System.out.println("사이즈 업");
        }
        System.out.println("라떼 주문 완료 #1");

        // 오후 2시 이전, 모닝 라떼를 마시지 않은 경우?
        hour = 10;
        boolean morningLatte = false;  // 모닝커피
       // if (hour < 14 && morningCoffee == false) {
        if (hour < 14 && !morningLatte) {
            System.out.println("녹차 라떼 +1");
        }
        System.out.println("라떼 주문 완료 #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningLatte = true;
       // if (hour >= 14 || morningCoffee == true){
        if (hour >= 14 || morningLatte){
            System.out.println("녹차 라떼 (디카페인) +1");
        }
        System.out.println("라떼 주문 완료 #3");
    }
}
