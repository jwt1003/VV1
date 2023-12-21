package com.demo;

public class demo11 {
    public static void main(String[] args) {
        A input = new A();
        input.test(4);


        int out = input.test1(5);
        System.out.println(out);
    }
}

class A{
    public void test(int n){
        if (n > 2){
            test(n - 1);
        }else{
            System.out.println("n = " + n);
        }
    }

    public int test1(int n){
        if (n == 1){
            return 1;
        }else{
            return test1(n - 1) * n;
        }
    }
}
