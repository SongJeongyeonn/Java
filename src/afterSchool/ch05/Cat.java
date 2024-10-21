package afterSchool.ch05;

public class Cat {
    // 필드 영역
    String name;
    String breeds;
    double weight;

    public void claw(){
        System.out.printf("[%s]의 할퀴기!! 슥삭!\n", name);
    }

    public void meow(){
        System.out.printf("[%s]의 야옹~\n", name);
    }

}
