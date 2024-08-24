package chap.chap_04;

public class _03_Elseif {
    public static void main(String[] args) {
        // 조건문 Elseif

        // 한라봉 에이드가 있으면 +1
        // 또는 청포도 주스가 있으면 +1
        // 또는 녹차 라떼 +1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean greengrapeJuice = true; // 청포도 주스

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (greengrapeJuice){
            System.out.println("청포도 에이드 +1");
        } else {
            System.out.println("녹차 라떼 +1");
        }
        System.out.println("음료 주문 완료 #1");

        // else if 는 여러번 사용 가능
        hallabongAde = false;
        greengrapeJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (greengrapeJuice){
            System.out.println("청포도 에이드 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("녹차 라떼 +1");
        }
        System.out.println("음료 주문 완료 #2");

        // else 는 없어도 가능
        hallabongAde = false;
        greengrapeJuice = false;
        orangeJuice = false;

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (greengrapeJuice){
            System.out.println("청포도 에이드 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("음료 주문 완료 #3");
    }
}
