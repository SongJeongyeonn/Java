package school.oop1;

public class Merchant {
    public String store;
    public String position;

    public String introduce() {
        return String.format("상점 %s의 %s입니다.", store, position);
    }
}
