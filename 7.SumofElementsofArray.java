package com.TCSNQTPREPQUES.ArrayQ;

//Solution 1: Using for loop
//        Approach:
//        Using for loop traverse through the array and while traversing  maintain  a variable for storing sum of the elements in the array.
//        After completing the traversal simply print the sum
//Time Complexity: O(n)

//public class sumOfElementsArray {
//    public static void main(String[] args) {
//        int n = 5;
//        int[] arr = {1,2,3,4,5};
//        int sum = 0;
//
//        for (int i=0;i<n;i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }
//}

//Solution 2: Using collection in Java or STL in C++
//For Java: Instream sum() gives the sum of all the elements in the stream.

import java.util.stream.IntStream;

public class sumOfElementsArray {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        int sum = IntStream.of(arr).sum();
        System.out.println(sum);

    }
}
