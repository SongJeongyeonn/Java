package school.exam2;

public class exam3 {
    public static void main(String[] args) {
        String []names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Sam"};
        int []scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};
        int i = topIndex(scores); // 배열 중 가장 큰 요소의 인덱스를 계산
        System.out.printf("1등: %s(%d점)", names[i], scores[i]);
    }
    // 정수형 배열을 입력받아, 가장 큰 요소의 인덱스를 반환
    public static int topIndex(int []arr) {
        int big = 0;
        for(int i = 1; i < arr.length; i++)
            if(arr[big] < arr[i]) {
                big = i;
            }
        return big;
    }
}
