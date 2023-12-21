package com.demo;

import java.util.Arrays;

public class demo04 {
    public static void main(String[] args) {

        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        int startIndex = -1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {

            int j = i;

            while (j > 0 && arr[j] < arr[j - 1] ) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
