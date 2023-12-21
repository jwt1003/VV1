package com.demo.toString;

public class demo01 {
    public static void main(String[] args) {
        A a = new A("小妖怪","巡山的",666);
        System.out.println(a.toString());
    }
}

class A {
    private String name;
    private String job;
    private double salary;

    public A(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

//    重写toString 方法，输出对象的属性


    @Override
    public String toString() {      //重写后，一般是把对象的属性值输出，当然也可以自己定制
        return "A{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
