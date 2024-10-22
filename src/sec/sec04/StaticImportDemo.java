package sec.sec04;

import  static java.util.Arrays.sort; // 정적 import문
import java.util.Calendar; // import문

public class StaticImportDemo {
    public static void main(String[] args) {
        int[] data = {3,5,1,7};
        sort(data); // 정적 import문은 클래스 이름 없이 맴버만 적어준다.
        System.out.println(Calendar.JANUARY); // import문은 클래스의 이름과 함께 필드를 사용한다.
        Calendar.getInstance(); // import문은 클래스의 이름과 함께 메서드를 사용한다.
    }
}
