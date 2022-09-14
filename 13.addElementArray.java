package com.TCSNQTPREPQUES.ArrayQ;

public class elementAddArray {
    public static void main(String[] args) {
        int n = 5;
        int[] array = {1,2,3,4,5};
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i] = array[i];
        }

        insertbeginning(6,arr,n);
        //insertending(7,arr,n);
        //insertatpos(100,3,arr);

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertbeginning(int x,int[] arr,int n){
        for(int i=n-1;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = x;
    }

    public static void insertending(int x,int[] arr,int n){
        arr[n] = x;
    }

    public static void insertatpos(int x,int z,int[] arr){
        for(int i= arr.length-2;i>=z-1;i--){
            arr[i+1] = arr[i];
        }
        arr[z-1] = x;
    }

}
