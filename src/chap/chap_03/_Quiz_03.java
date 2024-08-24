package chap.chap_03;
/*
(실행 결과)
"901231-1234567" 인 경우 901231-1 까지 출력
"030708-4567890" 인 경우 030708-4 까지 출력
 */
public class _Quiz_03 {
    public static void main(String[] args) {
        String num = "901231-1234567";
        System.out.println(num.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        num = "030708-4567890";
        System.out.println(num.substring(0, num.indexOf("-")+2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
