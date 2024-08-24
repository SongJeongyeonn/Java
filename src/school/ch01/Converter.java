package school.ch01;

public class Converter {
    public static void main(String[] args) {
        float h = 77; // 변화하려는 화씨 온도값
        double s = (h-32.0)/1.8; // 온도 변화 공식 적용
        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도입니다.", h, s);
    }
}
