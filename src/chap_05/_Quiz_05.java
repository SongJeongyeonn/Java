package chap_05;
/* 조건
신발 사이즈는 250 부터 295까지 5 단위씩 증가
신발 사이즈의 수는 총 10가지
*/
public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoes = { 250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
        for(int i = 0; i < shoes.length; i++){
            System.out.print("사이즈 " + shoes[i] + " (재고 있음)\n");
        }
    }
}
