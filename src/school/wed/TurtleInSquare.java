package school.wed;
import turtle.Turtle;
public class TurtleInSquare {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.width(1);
        t.up();
        t.left(90);
        t.forward(50);
        t.down();
        for(int i = 0; i <= 4; i++){
            if(i%4 == 0){
                t.right(90);
                t.forward(50);
                continue;
            }
            t.right(90);
            t.forward(100);
        }
        t.up();
        t.setPosition(0,0);
    }
}
