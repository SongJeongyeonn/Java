package sec.sec08;

public class UpcastDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();

        p = s;
        /* p.number = 1; 부모타입에 없는 맴버로 부모타입 변수에서 볼 수 없다.
         p.work(); */
        p.whoami();
    }
}