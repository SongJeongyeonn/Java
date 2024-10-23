package sec.sec06.other;

import sec.sec06.One;

public class Three{
    void print(){
        One o = new One();
      /*  System.out.println(o.secret);
        System.out.println(o.roommate);
        System.out.println(o.child); */
        System.out.println(o.anybody); // 다른 패키지에 있는 일반 클래스의 접근은 public 맴버만 가능하다.
    }

}
