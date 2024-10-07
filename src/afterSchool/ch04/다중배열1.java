package afterSchool.ch04;

import java.util.Arrays;

public class 다중배열1 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int[][] num = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(n));
        for(int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
    }
}
