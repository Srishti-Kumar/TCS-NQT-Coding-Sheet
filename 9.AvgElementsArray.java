package com.TCSNQTPREPQUES.ArrayQ;

import java.util.stream.IntStream;

public class avgElementsArray {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {1,2,1,1,5,1};

        double sum = IntStream.of(arr).sum();
        System.out.println(sum/N);
    }
}
