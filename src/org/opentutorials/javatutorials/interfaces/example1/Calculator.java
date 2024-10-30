package org.opentutorials.javatutorials.interfaces.example1;

class Calculator {
    int left, right;
    public void setOprands(int left, int right) { // 개수가 다르다(커뮤니케이션 miss)
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}