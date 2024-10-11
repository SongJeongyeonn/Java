package school.oop2;

public class App_v2 {
    public static void main(String[] args) {
        Malatang_v2 stew = new Malatang_v2("소고기", "오징어");
        stew.mushuroom = "목이버섯";
        stew.dubu = "건두부";
        stew.noodle = "당면";

        System.out.println(stew.getlngredientsByString());
    }
}
