package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "정연"; // 선언과 동시에 값을 대입
        int hour = 2;
        System.out.println(name + "님 점심시간까지 " + hour + "시간 남았습니다.");
        System.out.println(name + "님 점심시간입니다.");

        double score = 90.5;
        char grade = 'A';
        name = "정역"; // 값을 바꿀수 있다.
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;//실수형 자료는 double로 판단하기에, float를 사용할때는 값 뒤에 F(f)를 붙인다.
        System.out.println(d);
        System.out.println(f);//float는 소수점 7자리까지만 표현한다.

        long l = 1000000000000L;//정수형 자료는 int로 판단하기에, long을 사용할때는 값 뒤에 L(l)을 붙인다.
        l = 1000_000_000_000L;
        System.out.println(l);
        //정수형: int < long  실수형: float < double  문자: char  문자열: String
    }
}
