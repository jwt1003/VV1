package com.demo;

public class demo12 {
    public static void main(String[] args) {
        T input = new T();
        int out = input.fei(7);
        System.out.println(out);
    }
}


class T {
    public int fei(int n){
        if (n >= 1){
            if (n == 1 || n == 2){
                return 1;
            }else{
                return fei(n - 1) + fei(n - 2);
            }
        }else{
            System.out.println("请输入大于1的数");
            return -1;
        }
    }
}
