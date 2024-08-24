package chap.chap_02;
/*
(실행 결과)
키가 121cm 이므로 탑승 가능합니다 // 값이 120 이상인 경우
 */
public class _Quiz_02 {
    public static void main(String[] args) {
        int cm = 121;
        String s = cm >= 120 ? "가능" : "불가능";
        System.out.println("키가 " + cm + "cm 이므로 탑승 " + s + "합니다");
    }

}
