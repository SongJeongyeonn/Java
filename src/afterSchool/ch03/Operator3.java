package afterSchool.ch03;

public class Operator3 {
    public static void main(String[] args) {
        int l = 100, e = 98, m = 90, g = 100, c = 80;
        System.out.println(l != m); // true
        System.out.println(m == e); // false
        System.out.println(l < g); // false
        System.out.println(l <= g); // true
        System.out.println(e > m); // true
        System.out.println(e >= g); // false

        // 논리 연산자
        boolean b = true;
        System.out.println(e >= 90 && c >= 90); // false(t/f)
        System.out.println(e >= 90 && m >= 90); // true(t/t)
        System.out.println(g > 90 || c > 90); // true(t/f)
        System.out.println(m > 95 || c > 80); // false(f/f)
        System.out.println(!b); // false(t)
    }
}
