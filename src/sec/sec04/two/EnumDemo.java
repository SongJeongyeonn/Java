package sec.sec04.two;

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if(gender == Gender.MALE)
            System.out.println(Gender.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");
        for(Gender g : Gender.values()) // for-each문
            System.out.println(g.name()); // 열거타입의 상수이름을 반환한다.
        System.out.println(Gender.valueOf("MALE")); // MALE에 대응하는 열거타입 상수를 반환한다.
    }
}
enum Gender{
    MALE("남성"), FEMALE("여성"); // new 연산자 없이 상수이름을 사용한다.
    private String s;
    Gender(String s){
        this.s = s;
    }
    public String toString(){
        return s;
    }
}