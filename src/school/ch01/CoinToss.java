package school.ch01;
/*
 * 동전 던지기
 * 파일명: CoinToss.java
 */
public class CoinToss {
    public static void main(String[] args) {
        System.out.printf("당첨: %b\n", toss());
    }
    public static boolean toss() {
        return Math.random() >= 0.5;
    }
}
