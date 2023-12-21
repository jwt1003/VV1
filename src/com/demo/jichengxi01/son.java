package com.demo.jichengxi01;

public class son extends father{
    public son(){
        System.out.println("son()...");
    }

    public void sayok() {
        //非私有的属性和方法可以在子类直接访问
        //但是私有的属性和方法不能再子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();;
        test200();
        test300();

        //test400();    会报错，要使用的话，通过父类提供的公共的方法去访问。
        calltest400();
        System.out.println("n4=" + getN4());

    }

}
