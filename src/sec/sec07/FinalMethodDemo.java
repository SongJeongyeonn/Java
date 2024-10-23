package sec.sec07;
class Chess{
    enum ChessPlayer{
        WHITE, BLACK
    }

    final ChessPlayer getFirstPlayer(){
        return ChessPlayer.WHITE;
    }
}
class WorldChess extends Chess{
    // ChessPlayer getFirstPlayer() {}  getFirstPlayer()은 final 메서드로 오바리이딩을 하면 오류 발생
}
public class FinalMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}
