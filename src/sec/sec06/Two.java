package sec.sec06;

public class Two {
    void print(){
        One o = new One();
        // System.out.println(o.secret);  private 맴버에는 접근 불가
        System.out.println(o.roommate);
        System.out.println(o.child);
        System.out.println(o.anybody);
    }
}
