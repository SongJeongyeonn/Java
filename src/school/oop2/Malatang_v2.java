package school.oop2;

public class Malatang_v2 {
    public String meat;
    public String sea;
    public String mushuroom;
    public String dubu;
    public String noodle;

    public Malatang_v2(String meat, String sea) {
        this.meat = meat;
        this.sea = sea;
    }

    public String getlngredientsByString() {
        return String.format("마라탕 재료: [고기: %s, 해물: %s, 버섯: %s, 두부: %s, 면: %s]", meat, sea, mushuroom, dubu, noodle);
    }
}
