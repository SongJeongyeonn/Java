package org.opentutorials.javatutorials.interfaces.example1;

interface I{
    public void z(); // abstract 메서드와 같이 본체가 없다.
}

class A implements I{ // 클래스 A는 인터페이스 I를 구현한다.
    public void z(){} // 그렇기에 그 안에있는 메서드도 구현해야한다.(본체 존재하도록)
}