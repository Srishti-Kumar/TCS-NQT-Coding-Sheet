package com.TCSNQTPREPQUES.ArrayQ;

import java.util.Arrays;

//Time Complexity: O(N*log N), Sorting of array

public class median {
    public static void main(String[] args) {
        //int[] arr = {2,4,1,3,5};
        int[] arr = {4, 7, 1, 2, 5, 6};
        Arrays.sort(arr);
        int n = arr.length;
        int med = 0;
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        if(n%2!=0){
            med = arr[n/2];
        } else {
            int ind1 = (n / 2) - 1;
            int ind2 = (n / 2);
            System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
        }
        System.out.println(med);
    }
}
