package com.demo;

import java.util.Arrays;

public class demo03 {
    public static void main(String[] args) {

        int[] arr = {2,4,5,100,1};

        for (int i = 0; i < arr.length - 1; i++) {      //i代表这一轮拿着那个数比较，外层循环是循环的轮数
            for (int j = 1 + i; j < arr.length; j++) {      //j代表i后面的数，内层循环是要干的事情
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
