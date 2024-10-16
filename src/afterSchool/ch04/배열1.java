package afterSchool.ch04;

public class 배열1 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int s_size = scores.length;

        System.out.println(scores[0]); // 초깃값은 0
        System.out.println(scores[9]);
        // System.out.println(scores[10]); Err
        System.out.println(scores[s_size-1]);
    }
}
