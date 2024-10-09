package school.sec.sec05;

public class CompLogicDemo {
    public static void main(String[] args) {
        int x = 0, y = 1;
        System.out.println((x < 1) || (y-- < 1));
        System.out.println("x= " + x + ", y= " + y);
        x = 0;
        y = 1;
        System.out.println((x < 1) | (y-- < 1)); // |와 &는 쇼트서킷을 사용하지 않는다.
        System.out.println("x= " + x + ", y= " + y);
    }
}
