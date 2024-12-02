package afterSchool.ch08;

public class UpCastingTest {
    public static void main(String[] args) {
        Square1 s = new Square1();
        s.name = "정사각형";
        Tringle1 t = new Tringle1();
        t.name = "삼각형";
        Circle1 c = new Circle1();
        c.name = "원";

        Shape1[] shapes = {s,t,c};
        for(int i = 0; i < shapes.length; i++){
            System.out.printf("%d번 인덱스의 도형: %s\n", i, shapes[i].name);
        }
    }
}
class Shape1{
    String name;
}
class Square1 extends Shape1 {}
class Tringle1 extends Shape1 {}
class Circle1 extends Shape1 {}