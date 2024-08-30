package school.ch01;
/*
 * 피타고라스의 정리를 이용하여 직각삼각형의 빗변 길이를 구하는 프로그램
 * 파일명: Pythagoras.java
 * 빗변이 아닌 나머지 두 변의 길이가 cm단위로 주어질 때,
 * 피타고라스의 정리(c^2 = a^2 + b^2)를 이용하여 빗변의 길이를 cm단위로 구한다.
 */
public class Pythagoras {
    public static void main(String[] args) {
        System.out.printf("빗변의 길이: %dcm", hypotenus(3,4));
    }
    public static int hypotenus(int a, int b) {
        return (int)Math.sqrt(a*a+b*b);
    }
}

