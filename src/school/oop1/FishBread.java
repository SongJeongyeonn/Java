package school.oop1;

public class FishBread {
    public static double volume;
    public String filling;

    public String introduce() {
        return String.format("앙금에 %s(이)가 들어있는 붕어빵입니다.",filling);
    }

    public boolean equals(FishBread obj) {
        return this.filling.equals(obj.filling);
    }
}
