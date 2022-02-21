package com.company;

import java.util.Arrays;

public class ChangeArr {
    public static int[] exchange(int[] arr){
        int tmp1=arr[0],tmp2=arr[1];
        arr[0]=arr[2];
        arr[1]=arr[3];
        arr[2]=tmp1;
        arr[3]=tmp2;
        return arr;
    }
    public static void main(String[] args){
        int arr[]={1,3,5,7};
        System.out.println(Arrays.toString(exchange(arr)));
    }
}
