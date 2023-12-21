package com.demo;

public class demo15 {
    public static void main(String[] args) {
        B b = new B();
        b.test1();
    }
}

class B {
    String name = "小狗";
    int age = 18;

    public void test1() {
        System.out.println("name=" + this.name + "\n" + "age=" + this.age);
    }
}

