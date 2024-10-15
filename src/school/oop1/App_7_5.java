package school.oop1;

public class App_7_5 {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.merchandise = "팥";
        c.orderMode = "매장";

        Merchant m = new Merchant();
        m.store = "소마고빵집";
        m.position = "점장";

        FishBread fb = c.placeOrder(m);
        System.out.printf("주문할 상품의 소개: \"%s\"\n", fb.introduce());
    }
}
