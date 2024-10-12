package school.sec.sec03;

public class IncrementDemo {
    public static void main(String[] args) {
        int[] x = {0};
        System.out.println("호출 전의 x[0] = " + x[0]);

        increment(x);
        System.out.println("호출 후의 x[0] = " + x[0]);
    }

    public static void increment(int[] n){ // 인수인 배열 변수 x의 값을 매개변수 n에게 복사한다.
        System.out.print("increment() 메서드 안에서 ");
        System.out.print("n[0] = " + n[0] + "---> ");
        n[0]++;
        System.out.println("n[0] = " + n[0]);
    }
}
