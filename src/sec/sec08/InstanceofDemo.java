package sec.sec08;

public class InstanceofDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();

        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
        System.out.println(p instanceof Student);
       // System.out.println(s instanceof String);  s가 String 타입과 관계가 없어 오류 발생

        downcast(s);
    }
    static void downcast(Person p){
        if(p instanceof Student){
            Student s = (Student) p;
            System.out.println("ok, 하향 타입 변환");
        }
    }
}
