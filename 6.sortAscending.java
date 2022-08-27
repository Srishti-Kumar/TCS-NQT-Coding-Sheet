package com.TCSNQTPREPQUES.ArrayQ;

import java.util.Arrays;

public class ascendingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 15, 5, 9, 20};
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < n/2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n-1; i >= n/2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
