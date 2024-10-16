package afterSchool.ch04;

public class 반복문3 {
    public static void main(String[] args) {
        int number = 1;
        while(number < 30){
            if(number % 2 == 0)
                System.out.print(number + " ");
            number++;
        }
        /* for
        for(int i = 1; i < 30; i++)
            if(i%2 == 0)
                System.out.printf("%d ", i);

         */
    }
}
