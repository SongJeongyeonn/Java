package school.oop1;

public class FishBread {
    public static double volume; // 클래스 변수
    public String filling; // 인스턴스 변수

    public String introduce() {
        return String.format("앙금에 %s(이)가 들어있는 붕어빵입니다.",filling);
    }

    public boolean equals(FishBread obj) {
        return this.filling.equals(obj.filling);
    }
}
