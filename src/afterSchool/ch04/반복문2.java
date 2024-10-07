package afterSchool.ch04;

public class 반복문2 {
    public static void main(String[] args) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0; i < 26; i++) {
            System.out.printf("%c ",alphabet[i]-32);
        }
    }
}
