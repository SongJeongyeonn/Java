package school.sec.sec01;

public class String2Demo {
    public static void main(String[] args) {
        String s1 = "Hi, Java!";
        String s2 = new String("Hi, Java!");
        String s3 = "Hi, Code!";
        String s4 = "Hi, java!";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4)); // 대소문자 구분 없이 비교

        System.out.println(s1.compareTo(s3)); // 사전 순으로 비교해 정숫값을 반환
        System.out.println(s1.compareToIgnoreCase(s4)); // 대소문자 구분 없이 사전 순으로 비교한다.
        System.out.println(s3.compareTo(s4));
        System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));
    }
}
