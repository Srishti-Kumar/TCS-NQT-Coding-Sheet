package com.TCSNQTPREPQUES.ArrayQ;

import java.util.HashMap;
import java.util.HashSet;

public class removeDupInUnsortedArray {
    public static void main(String[] args) {
        //int[] arr ={2,3,1,9,3,1,3,9};
        int[] arr ={4,3,9,2,4,1,10,89,34};
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i< arr.length;i++) {
            if (!hs.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                hs.put(arr[i], i);
            }
        }
    }
}
