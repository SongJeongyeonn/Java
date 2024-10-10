package school.oop2;

public class App_8_3 {
    public static void main(String[] args) {
        String[] items = {"기러기", "나포리","도라지"};

        for(String item : items) { // item이라는 변수 이름으로 items의 변수를 하나씩 가져온다.
            System.out.println(item);
        }

        for(String item : items) {
            item = "나비"; // 주의! 수정 불가
        }

        for(String item : items) {
            System.out.println(item);
        }
    }
}
