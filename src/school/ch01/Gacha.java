package school.ch01;
/*
 * 번호 추첨 프로그램
 * 파일명: Gacha.java
 * 1부터 n까지의 자연수에서 임의의 자연수 하나를 반환한다.
 */
public class Gacha {
    public static void main(String[] args) {
        int n = 10;
        int gacha = rollGacha(n);
        System.out.printf("%d개의 번호 중 추첨 결과: %d", n, gacha);
    }

    // 메소드 rollGacha 작성
    public static int rollGacha(int n) {
        return (int)(n * Math.random())+1;
    }
}
