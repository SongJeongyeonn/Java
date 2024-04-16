package chap_01;

public class _05_VariableNaming {
    // 변수 이름 짓는 법
    // 1. 저장할 값에 어울리는 이름
    // 2. 밑줄(_), 영문자, 숫자만 사용 가능(공백 사용 불가)
    // 3. 밑줄, 영문자로 시작 가능
    // 4. 한 단어 또는 2개 이상 단어의 연속
    // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(2개 이상 단어를 사용할 때)
    // 6. 예약어는 사용 불가 (public, static, void, char 등)

    // 입국 신고서(여행)
    String nationality = "대한민국"; // 국적
    String firstName = "정연"; // 이름
    String lastName = "송"; // 성
    String dateOfBirth = "2024-11-21"; // 생년월일
    String residentialAddress = "무슨 호텔"; // 체류지
    String purposeOfVisit = "관광"; // 입국목적
    String flightNo = "KE657"; // 항공 편명
    String _flightNo = "KE657"; // 밑줄 시작
    String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
    // String( -flightNo = "KE657"; // 잘못된 밑줄 사용

    int accompany = 5; // 동반 가족 수
    int lengthOfStay = 7; //체류 기간

    String item1 = "시계";
    String item2 = "가방";
    // String 3item = "전자제품"; //변수이름은 영문자와 밑줄로만 시작이 가능하다.

    // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지않은 경우)
    int i = 0;
    String s = "";
    String str = "";

    // 절대 변하지 않는 상수는 대문자로
    final String CODE = "KR";
}
