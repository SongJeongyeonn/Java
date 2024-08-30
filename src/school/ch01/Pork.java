package school.ch01;

public class Pork {
    public static void main(String[] args) {
        int n = 3;
        double x = calculate(n);
        System.out.printf("삼겹살 %d인분의 칼로리: %.2f kcal", n, x);
    }
    public static double calculate(int amount) {
        int totalGram = 180 * amount;
        double totalKcal = totalGram * 5.179;
        return totalKcal;
    }
}
