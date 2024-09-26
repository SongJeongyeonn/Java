package school.oop1;

public class App_7_1 {
    public static void main(String[] args) {
        FishBread fb1 = new FishBread(); // fb1은 FishBread 객체의 주소 저장 (참조 변수 사이의 대입연산)
        fb1.filling = "팥";

        FishBread fb2 = new FishBread(); // fb2은 FishBread 객체의 주소 저장
        fb2.filling = "팥";

        System.out.println(fb1.introduce());
        System.out.println(fb2.introduce());

        System.out.println(fb1 == fb2 ? "같음" : "다름"); // 값이 아니라 주소를 비교하는 것이기에 다른 객체임으로 "다름" 출력
    }
}