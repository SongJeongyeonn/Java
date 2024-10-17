package sec.sec04;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;
        double b;

        // System.out.print(b); 초기화 없이 사용 불가
        // System.out.print(a + c); c 변수는 아직 선언되지 않았기 때문에 사용할 수 없다.

        int c = 0;

        // public double d = 0.0; 지역변수는 public으로 지정 불가

        for(int e = 0; e < 10; e++){
            // int a = 1; 이미 선언되었기에 같은 이름으로 재 선언 불가
            System.out.print(e);
        }
    }
}
