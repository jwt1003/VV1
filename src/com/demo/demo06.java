package com.demo;

public class demo06 {
    public static void main(String[] args) {

        int jc = getJC(5);
        System.out.println(jc);
    }

    public static int getJC(int number) {
        if (number == 1) {
            return 1;
        }

        return number * getJC(number - 1);
    }

}
