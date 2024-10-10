package school.oop2;

public class Item1 {
    public String name;
    public int price;

    public Item1() {
        this("아이템",0); // 다른 생성자 호출
    }

    public Item1(String name) {
        this(name,0); // 다른 생성자 호출
    }

    public Item1(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
