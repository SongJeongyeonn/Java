package school.ch01;

public class WhileCountdown {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int num){
        System.out.println("카운트 다움을 시작합니다.");
        while(num >= 0){
            System.out.printf("%d..\n", num);
            num--;
        }
        System.out.println("발사!!");
    }
}
