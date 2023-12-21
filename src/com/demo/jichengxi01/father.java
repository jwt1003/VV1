package com.demo.jichengxi01;

public class father {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public father() {       //无参构造器
    }

    public int getN4() {    //父类提供的公共方法
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void calltest400() {     //父类再使用一个公共方法调用test400()，
        // 这样子类使用这个方法就可以调用test400()
        test400();
    }

}
