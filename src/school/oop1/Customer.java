package school.oop1;

public class Customer {
    public String merchandise;
    public String orderMode;

    public String introduce() {
        return String.format("상품 %s(을)를 %s(으)로 주문하는 손님입니다.", merchandise, orderMode);
    }
}
