package school.oop2;

public class App_v1 {
    public static void main(String[] args) {
        Malatang_v1 stew = new Malatang_v1();
        stew.meat = "양고기";
        stew.sea = "오징어";
        stew.mushuroom = "목이버섯";
        stew.dubu = "건두부";
        stew.noodle = "당면";

        System.out.println(stew.getlngredientsByString());
    }
}
