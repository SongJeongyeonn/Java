package school.ch01;

public class practice {
    public static void main(String[] args) {
        draw(5);
        draw(0);
    }
    public static void draw(int n) {
        n += 5;
        switch(n) {
            case 5:
                n+=10;
            case 15:
                System.out.println(n);
                n-=5;
            case 10:
                switch(n) {
                    case 5:
                        System.out.println(n);
                    case 10:
                        n+=10;
                        System.out.println(n);
                    case 11:
                        n+=11;
                }
            case 20:
                break;

        }
    }
}
