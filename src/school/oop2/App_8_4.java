package school.oop2;

public class App_8_4 {
    public static void main(String[] args) {
        String original = "안녕";
        String modified = original.concat("하세요");

        // 주의!
        System.out.println("인사: " + original);
        System.out.println("긴 인사: " + modified);
    }
}
