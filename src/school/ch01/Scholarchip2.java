package school.ch01;

public class Scholarchip2 {
    public static void main(String[] args) {
        printScholarship("Park",100,92);
        printScholarship("Kim", 82, 96);
        printScholarship("Choi", 82, 88);
    }
    // 이름과 수학 및 영어 점수를 입력받아, 장학금 수령 여부를 출력
    public static void printScholarship(String name, int math, int eng) {
        String result = "";
        result = math >= 90 && eng >= 90 ? "전액 장학금!" : math >= 90 || eng >= 90 ? "반액 장학금!" : "다음 기회에~";
        System.out.printf("%s => %s\n",name,result);
    }
}
