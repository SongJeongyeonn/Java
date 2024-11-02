package school.wed;
import turtle.Turtle;
public class Turtle8 {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.width(8);
        for(int i = 0; i < 15; i++) {
            if(i/8 < 1)
                t.left(45);
            else
                t.right(45);
            if (i % 2 == 0)
                t.forward(30);
            else
                t.forward(50);
        }
    }
}
