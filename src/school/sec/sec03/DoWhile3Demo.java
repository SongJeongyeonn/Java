package school.sec.sec03;

public class DoWhile3Demo {
    public static void main(String[] args) {
        int row = 2;
        do{
            int column = 1;
            do{
                column++;
            }while(column < 10);
            row++;
        }while(row < 10);
    }
}
