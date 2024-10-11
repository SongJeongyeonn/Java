package school.oop2;

public class Malatang_v3 {
    public String meat;
    public String sea;
    public String mushuroom;
    public String dubu;
    public String noodle;

    private Malatang_v3() {
        this.sea = "다시 마";
        System.out.println("기본 생성자 끝");
    }

    private Malatang_v3(String meat) {
        this(); // this는 호출 키워드로 맨 위에 선언한다.
        this.meat = meat;
        System.out.println("고기 생성자 끝");
    }

    public Malatang_v3(String meat, String sea) {
        this(meat);
        this.sea = sea;
        System.out.println("고기, 해물 생사자 끝");
    }
}
