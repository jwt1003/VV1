package com.demo;

public class demo01 {
    public static void main(String[] args) {

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    public static void quicksort(int[] arr, int i, int j) {
        //定义两个变量表示头和尾
        int start = i;
        int end = j;

        //结束的标志
        if (start > end) {
            return;
        }

        //定义变量为基准数字
        int basenumber = arr[i];


        while (start != end) {
            //利用end找到比基准数小的数字
            while (true) {
                if (arr[end] < basenumber || end <= start) {
                    break;
                }
                end--;
            }
            //利用start找到比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > basenumber) {
                    break;
                }
                start++;
            }

            //把start和end交换位置
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //交换start和basenumber的位置，因为最后start和end是重合的，所以下面用end或者start都可以。
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        //basenumber左边的排序
        quicksort(arr, i, start - 1);

        //basenumber右边的排序
        quicksort(arr, start + 1, j);
    }
}
