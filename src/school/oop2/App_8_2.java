package school.oop2;

public class App_8_2 {
    public static void main(String[] args) {
        // 기본 생성자 호출
        Item_2 item = new Item_2();

        item.setName("도넛"); // 값을 설정
        item.setPrice(-1);
        System.out.printf("이름 %s, 가격: %d원\n", item.getName(),item.getPrice()); // 설정한 값에 접근하여 가져온다.

		/*
		System.out.printf("이름: %s, 가격: %d원\n", item.getName(), item.getPrice());

		item.setName("도넛");
		item.setPrice(5000);
		System.out.printf("이름: %s, 가격: %d원\n", item.getName(), item.getPrice());
		*/
    }
}
