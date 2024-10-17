package school.oop1;

public class App_7_4 {
    public static void main(String[] args) {
        FishBread fb = new FishBread();
        fb.filling = "초콜릿";

        Merchant m = new Merchant();
        m.store = "소마고빵집";
        m.position = "점장";

        Customer c = new Customer();
        c.merchandise = "초콜릿맛 붕어빵";
        c.orderMode = "포장";

        System.out.println(fb.introduce()); // 같은 이름의 메소드지만 각 클래스에 따라 다른 실행 결과를 보여준다.(다형성)
        System.out.println(m.introduce()); // 객체의 종류에따라 다른 결과가 나타나도록 하는 프로그래밍 기술이다.
        System.out.println(c.introduce());
    }
}
