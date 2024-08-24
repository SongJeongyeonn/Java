package school.ch01;

public class TypeMismatch {
    public static void main(String[] args) {
        // 변수 생성
        String title = "로미오와 줄리엣";
        // int author = "윌리엄 셰익스피어"; 문자열은 정수형에 넣어버림
        // int price = 5.94; 정수형에 소수를 넣어버림
        //결과 출력
        System.out.printf("제목: %s\n", title);
        //System.out.println("저자: %s\n", author);
        //System.out.println("가격: %f\n", price);
    }
}
