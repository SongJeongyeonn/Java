package school.wed;

public class Wrapper2 {
    public static void main(String[] args) {
        String numberString = "42";
        Integer wrappedNumber = Integer.valueOf(numberString);
        String str = Integer.toBinaryString(wrappedNumber); // 2진수 출력
        System.out.println(str);
    }
}
