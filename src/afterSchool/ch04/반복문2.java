package afterSchool.ch04;

public class 반복문2 {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }
        /* 소문자를 대문자로 바꾸는 코드
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0; i < 26; i++) {
            System.out.printf("%c ",alphabet[i]-32);
        }
         */
    }
}
