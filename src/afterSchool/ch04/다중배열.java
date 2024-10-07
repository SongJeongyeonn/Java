package afterSchool.ch04;

import java.util.Arrays;

public class 다중배열 {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,8,9,10};
        int[] a = Arrays.copyOf(b, 5);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
