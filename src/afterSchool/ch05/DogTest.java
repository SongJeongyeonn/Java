package afterSchool.ch05;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "바둑이";
        dog.breeds = "진돗개";
        dog.age = 7;
        System.out.printf("이름:%s\n", dog.name);
        System.out.printf("품종:%s\n", dog.breeds);
        System.out.printf("나이:%d\n", dog.age);
    }
}
class Dog {
    String name;
    String breeds;
    int age;

    public void wag(){
        System.out.println("살랑살랑");
    }

    public void bark(){
        System.out.println("멍멍");
    }
}