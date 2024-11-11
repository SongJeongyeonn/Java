package afterSchool.ch07;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<OrderItem> order = new ArrayList<OrderItem>();
        order.add(new OrderItem("후라이드 치킨", 9900, 3));
        order.add(new OrderItem("양념 치킨", 10900, 2));
        order.add(new OrderItem("간장 치킨", 11900, 2));

        int sum = 0;
        for (int i = 0; i < order.size(); i++) {
            OrderItem item = order.get(i);
            System.out.println(item.Print());
            sum += item.getPrice();
        }

        System.out.println("======================");
        System.out.printf("총합: %d원", sum);
    }
}

class OrderItem{
    private String name;
    private int price;
    private int cnt;
    public OrderItem(String _name, int _price, int _cnt){
        name = _name;
        price = _price;
        cnt = _cnt;
    }

    public String Print(){
        return String.format("%s(%d원) x %d마리", name, price, cnt);
    }
    public int getPrice(){
        return price * cnt;
    }
}