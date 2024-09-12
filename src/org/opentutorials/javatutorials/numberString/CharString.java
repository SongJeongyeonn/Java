package org.opentutorials.javatutorials.numberString;

public class CharString {
    public static void main(String[] args) {
        System.out.println('생');
        System.out.println("생활코딩");
        // System.out.println('생활코딩'); 문쟈열은 ""를 문자는 ''를 사용한다.
        System.out.println("생"); // 한글자인 문자열도 있기 때문에 오류가나지 않는다.
        System.out.println("1" + "1"); // 문자열이기 때문에 이어 붙여진 상태로 출력된다.
        System.out.println("egoing said \"Welcome programming world\""); // ", '를 출력하고 싶을때는 \(역슬레시)를 붙인다.
        System.out.println("HTML\nCSS\nJavaScript\n");
    }
}
