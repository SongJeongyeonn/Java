package school.oop2;

public class FishBreadM {
    public static void main(String[] args) {
        FishBread fishbread = new FishBread("팥");
        System.out.println(fishbread.introduce());
        FishBread fb1 = new FishBread("슈크림");
        System.out.println(fishbread.introduce());
    }
}
