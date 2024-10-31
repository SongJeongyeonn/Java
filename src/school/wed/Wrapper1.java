package school.wed;

public class Wrapper1 {
    public static void main(String[] args) {
        int n = 42;
        Integer boxedN = new Integer(n);
        int unboxedN = boxedN.intValue();

        System.out.println(n == unboxedN ? "같음" : "다름");
    }
}
