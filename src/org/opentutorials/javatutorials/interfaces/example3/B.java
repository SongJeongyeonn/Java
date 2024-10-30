package org.opentutorials.javatutorials.interfaces.example3;

interface I3{
    public void x();
}

interface I4 extends I3{ // I3을 상속받고 있다.
    public void z();
}

class B implements I4{ // I4를 구현한다.
    public void x(){}
    public void z(){}
}