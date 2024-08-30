package school.ch01;
/*
 * 자기 소개문을 만드는 프로그램
 * 파일명: Greeting.java
 */
public class Greeting {
    public static void main(String[] args) {
        System.out.println("안녕하세요.");
        System.out.printf("저는 %s입니다.\n",toGreet("광주소마고 ", 1, 2, 8, "송정연"));
        System.out.println("감사합니다.");
    }
    public static String toGreet(String h, int b1, int b2, int bh, String n) {
        return String.format("\"%s %d학년 %d반 %d번 %s", h,b1,b2,bh,n);
    }
}

