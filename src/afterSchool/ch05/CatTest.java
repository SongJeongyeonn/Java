package afterSchool.ch05;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "네로";
        cat2.name = "나비";
        cat1.meow();
        cat2.meow();
        cat1.claw();
        cat2.claw();
    }
}
