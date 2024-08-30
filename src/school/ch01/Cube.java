package school.ch01;

public class Cube {
    public static void main(String[] args) {
        int n = 3, v = voulume(n);
        System.out.printf("한 변의 길이가 %d인 정육면체의 부피: %d", n, v);
    }
    // 반환타입/메소드명/입력변수
    public static int voulume(int length) { return length*length*length; }
}
