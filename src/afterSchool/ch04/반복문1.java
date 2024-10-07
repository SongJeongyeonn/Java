package afterSchool.ch04;

public class 반복문1 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        for(i = 1; i <=10; i++) {
            sum+=i;
        }
        System.out.println(sum);
        sum = 0; i = 0;
        while(i <= 10) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
        sum = 0; i = 0;
        do {
            sum+=i;
            i++;
        }while(i <= 10);
        System.out.println(sum);
    }
}
