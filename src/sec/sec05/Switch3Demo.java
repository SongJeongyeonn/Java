package sec.sec05;

public class Switch3Demo {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");
    }

    static void whoIsIt(String bio){
        String kind = "...";
        switch (bio){
            case "호랑이", "사자" -> kind = "포유류"; // case와 일치 시 해당 레이블만 수행한다.
            case "독수리", "참새" -> kind = "조류";
            case "고등어", "연어" -> kind = "어류";
            default -> System.out.print("어이쿠!");
        }
        System.out.printf("%s는 %s이다.\n",bio, kind);
    }
}
