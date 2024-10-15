package school.ch01;

public class TSN_369 {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++) {
            String x = Integer.toString(i);
            if(x.contains("3") || x.contains("6") || x.contains("9")) {
                System.out.print("짝 ");
                continue;
            }
            System.out.printf("%d ", i);

        }
    }
}
