package com.leetcode.test;

import java.util.Arrays;

public class MinK {
    public static void main(String[] args) {
        int[] arr = {1,4,3,7,5,6,2,8};
        quickSort(arr, 0,7);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>high){
            return;
        }
        int i = low;
        int j = high;
        int temp = arr[low];
        while(i<j){

            while(arr[j]>=temp&&i<j){
                j--;
            }
            while(arr[i]<=temp&&i<j){
                i++;
            }

            if(i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j-1);
        quickSort(arr, j+1,high);
    }
}
