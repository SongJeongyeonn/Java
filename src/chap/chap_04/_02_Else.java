package chap.chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 15;
        if (hour < 14){ // 오후 2시 이전이면
            System.out.println("녹차 라떼 +1");
        } else{ // 그 외의 경우이면
            System.out.println("녹차 라떼 (디카페인) +1");
        }
        System.out.println("라떼 주문 완료 #1");

        // 오후 2시 이후거나 모닝커피를 마신 경우?
        hour = 10;
        boolean morningLatte = false;
        if(hour >= 14 || morningLatte == true){ // 오후 2시 이후거나 모닝커피를 마신 경우?
            System.out.println("녹차 라떼 (디카페인) +1");
        }else { // 그 외의 경우이면
            System.out.println("녹차 라떼 +1");
        }
        System.out.println("녹차 주문 완료 #2");
    }
}
