package school.sec.sec04;

public class ContitnueDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0)
                continue;
            System.out.print(i); // 교과서가 잘못됨
        }
    }
}
