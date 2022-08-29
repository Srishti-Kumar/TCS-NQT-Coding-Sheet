package com.TCSNQTPREPQUES.ArrayQ;
public class blockSwapAlgorithm {
    public static void main(String[] args) {
        //int n = 5;
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 2;
        int k2 = 3;

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.print("\n");
        //rightSwap(arr,n,k);
        leftSwap(arr1, arr1.length, k1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.print("\n");
        System.out.print("\n");

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.print("\n");
        leftSwap(arr2, arr2.length, k2);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }

    public static void swap(int[] arr,int start,int end) {
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] leftSwap(int[] arr,int n,int k){
        swap(arr,0,n-k-2);  //n-1-k-1
        swap(arr,n-1-k,n-1);
        swap(arr,0,n-1);
        return arr;
    }



}
