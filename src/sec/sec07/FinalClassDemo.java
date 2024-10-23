package sec.sec07;
class Good{
}

class Batter extends Good{
}

final class Best extends Batter{
}
// class NumberOne extends Best{}  Best는 final로 지정되있어 자식클래스로 확장이 불가능하다.
public class FinalClassDemo {
    public static void main(String[] args) {
        new Best();
    }
}
