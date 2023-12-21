package com.demo;

public class demo14 {
    public static void main(String[] args) {
        Cat in = new Cat();
        in.test2();
    }
}

class Cat {
    public void test1(String name, int age) {
        System.out.println("一狗");
    }

    public void test2() {
        this.test1("小狗", 18);           //这个语句必须放在第一条
        System.out.println("二狗");
    }

}

