package school.oop1;

public class App_7_2 {
    public static void main(String[] args) {
        FishBread fb1 = new FishBread();
        fb1.filling = "팥";

        FishBread fb2 = fb1; // fb2가 fb1의 주소를 참조하게 된다.
        fb2.filling = "슈크림"; // fb2의 값이 슈크림이므로 fb1도 슈크림이 된다.

        System.out.println(fb1.introduce());
        System.out.println(fb2.introduce());

        System.out.println(fb1 == fb2 ? "같음" : "다름"); // 하나의 객체로 하였기에 같은 곳을 참조함으로 "같음"이 출력된다.
    }
}
