package com.demo;

public class demo13 {
    public static void main(String[] args) {
        Dog d = new Dog("小狗", 18);
        d.out();
    }
}


class Dog {
    String name;
    int age;

    //如果构造器的形参，能够直接写成属性名就好了。但会出现一个问题，根据变量的作用域原则：
    //构造器的name，age是局部变量，而不是属性。

    /*public Dog(String dname, int dage) {
        name = dname;
        age = dage;
    }*/

    //this关键字就很好的解决了上述问题
    public Dog(String name,int age){
        this.name = name;       //this.name 就是当前对象的属性name
        this.age = age;         //this.age 就是当前对象的属性age
    }

    public void out() {
        System.out.println(name + "\t" + age);
    }
}
