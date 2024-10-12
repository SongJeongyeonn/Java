package school.sec.sec04;

public class CircleDemo {
    public static void main(String[] args){
        Circle myCircle = new Circle();

        myCircle.radius = 10.0;

        myCircle.show(myCircle.radius, myCircle.findArea());
    }
}
