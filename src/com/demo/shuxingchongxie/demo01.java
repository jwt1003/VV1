package com.demo.shuxingchongxie;

public class demo01 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);   //true
        System.out.println(bb instanceof AA);   //true

        //aa是编译类型，BB是运行类型
        AA aa = new BB();
        System.out.println(aa instanceof AA);   //true
        System.out.println(aa instanceof BB);   //true

        Object object = new Object();
        System.out.println(object instanceof AA);   //false

        String str = "hello";
        System.out.println(str instanceof Object);  //true
    }
}

class AA {
}

class BB extends AA {
}