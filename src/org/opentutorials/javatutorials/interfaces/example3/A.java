package org.opentutorials.javatutorials.interfaces.example3;

interface I1{
    public void x();
}

interface I2{
    public void z();
}

class A implements I1, I2{ // 하나의 클래스는 복수개의 인터페이스를 구현할 수 있다.
    public void x(){}
    public void z(){}
}