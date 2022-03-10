package com.company;

import java.util.Arrays;

public class Main {


    private static void insertionSort(int[] inTarr){
        for (int i=0; i<inTarr.length; i++){
            int tmp = inTarr[i], index=0;
            for(int j=i+1; j<inTarr.length; j++){
                if (inTarr[j]<tmp) {
                    tmp=inTarr[j];
                    index=j;
                }

            }
            if(tmp==inTarr[i]){
                System.out.println((i + 1) + ". adım :" + Arrays.toString(inTarr) + "("+inTarr[i]+" zaten en küçük bir değişiklik olmaz" + ")");
            }else {
                inTarr[index] = inTarr[i];
                inTarr[i] = tmp;
                System.out.println((i + 1) + ". adım :" + Arrays.toString(inTarr));
            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {22,27,16,2,18,6};
        int[] arr2 = {7,3,5,8,2,9,4,15,6};

        System.out.println("1. array");
        insertionSort(arr1);
        System.out.println("2. array");
        insertionSort(arr2);
        // write your code here
    }
}
