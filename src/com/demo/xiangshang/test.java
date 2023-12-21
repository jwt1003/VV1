package com.demo.xiangshang;

public class test {
    public static void main(String[] args) {

        Animal animal = new Cat();
        Object obj = new Cat();
//        animal.catchMouse;        不能调用，因为在编译阶段，能调用那些成员，是由编译类型来决定的

        //向下转型就可以调用：子类类型 引用名 = （子类类型）父类引用
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
