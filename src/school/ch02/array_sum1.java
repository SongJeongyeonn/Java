package school.ch02;

public class array_sum1 {
    public static  void main(String[] args) {
        int [] arr = {88, 76, 92, 68, 55, 48, 82};
        int sum = 0;

        sum += arr[0];
        sum += arr[1];
        sum += arr[2];
        sum += arr[3];
        sum += arr[4];
        sum += arr[5];
        sum += arr[6];

        System.out.printf("총합:%d", sum);
    }
}
