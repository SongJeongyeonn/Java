package school.oop2;

public class Item_2 {
    public String name;
    public int price;

    public Item_2() {
        this.name = "도넛";
        this.price = 0;
    }

    // Getter 메소드
    public String getName() {

        return name;
    }

    public int getPrice() {
        return price;
    }

    // Setter 메소드
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("가격을 0 미만으로 설정할 수 없어, 0으로 설정합니다.");
            price = 0;
        }
        this.price = price;
    }
}
