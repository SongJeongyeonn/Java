package afterSchool.ch04;

public class 배열3 {
    public static void main(String[] args) {
        // 동시에 특정 값으로 초기화
        int[] sales_table = {33,52,93,100,87};

        // 반복문으로 다 출력
        for(int i = 0; i < sales_table.length; i++)
            System.out.print(sales_table[i]+" ");
    }
}
