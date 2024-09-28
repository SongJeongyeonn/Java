package school.oop1;

public class App_7_3 {
    public static void main(String[] args) {
        FishBread.volume = 20.0;
        FishBread fb1 = new FishBread();
        fb1.filling = "팥";

        FishBread fb2 = new FishBread();
        fb2.filling = "팥";

        System.out.println(fb1.volume == fb2.volume ? "같음" : "다름"); // volume은 클래스 변수로 하나이기에 참조하는 주소가 같다.
        fb2.volume = 10.0; // volume의 값 변경
        System.out.printf("fb1: %.0f g으로 %s\n", fb1.volume, fb1.volume == fb2.volume ? "같음" : "다름");

        System.out.println(fb1.equals(fb2) ? "같음" : "다름"); // 내용 비교
    }
}
