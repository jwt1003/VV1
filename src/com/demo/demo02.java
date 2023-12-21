package com.demo;

import java.util.Arrays;

public class demo02 {
    public static void main(String[] args) {

        int[] arr = {2,4,5,3,1};

        for (int i = 0; i < arr.length - 1; i++) {          //外层循环是要遍历的轮数
            for (int j = 0; j < arr.length - i - 1; j++) {  //内层循环是要比较的次数
                if (arr[j] > arr[j + 1]) {                  //判断的条件是前一个元素大于后一个元素就交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
