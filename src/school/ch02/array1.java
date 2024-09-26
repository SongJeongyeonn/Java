package school.ch02;

public class array1 {
    public static void main(String[] args) {
        int a = 88;
        int b = 98;
        int c = 68;
        int d = 72;
        int e = 47;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int [] scores = {88, 98, 68, 72, 47};
        for(int i = 0; i < 5; i++)
            System.out.println(scores[i]);
    }
}