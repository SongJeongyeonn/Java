package school.oop2;

public class Item {
    public String name;
    public int price;
 // 생성자 오버로딩
    public Item() {
        this.name = "아이템";
        this.price = 0;
    }

    public Item(String name) {
        this.name = name;
        this.price = 0;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
