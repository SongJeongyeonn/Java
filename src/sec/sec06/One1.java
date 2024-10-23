package sec.sec06;

public class One1 extends One{
    void print(){
        // System.out.println(secret);  같은 패키지에 있는 자식 객체도 private 맴버에는 접근 불가
        System.out.println(roommate); // 같은 패키지에 있는 자식 객체는 부모 클래스의 private 빼고 접근할 수 있다.
        System.out.println(child);
        System.out.println(anybody);
    }
    /* void show()
    오버라이딩할 때 접근 범위가 좁아지면 오류가 발생한다.
     */
}
