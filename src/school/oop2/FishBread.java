package school.oop2;

public class FishBread {
    public String filling;

    public FishBread(String filling){
        this.filling = filling;
    }
    public String introduce() {
        return String.format("앙금에 %s가 들어있는 붕어빵입니다.", filling);
    }
}
