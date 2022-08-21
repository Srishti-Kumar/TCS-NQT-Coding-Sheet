package com.TCSNQTPREPQUES.ArrayQ;
//1. The native solution is to just sort the array and return  a[1] & a[n-2]
//import java.util.Arrays;
//
//public class secondSmallestLargestArray {
//    public static void main(String[] args) {
//        int[] arr = {2,7,5,4,9};
//        int n = arr.length;
//        getElements(arr,n);
//
//    }
//
//    public static void getElements(int[] arr,int n){
//        if (n == 0 || n == 1){
//            System.out.println("-1");
//            System.out.println(" ");
//            System.out.println("-1");
//            System.out.println("\n");
//        }
//        Arrays.sort(arr);
//        int a = arr[1];
//        int b = arr[n-2];
//        System.out.println("The second smallest number is: " + a);
//        System.out.println("The second largest number is: " + b);
//
//    }
//}

//2. Better solution is : Assuming a[0] as smallest & second smallest  and a[n-1] as largest & second_largest then
// traverse through whole array to find smallest number which also greater than actual smallest making it second smallest
//similarly for second largest

//public class secondSmallestLargestArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 6, 7, 5};
//        //int[] arr ={1};
//        int n = arr.length;
//        getElements(arr, n);
//    }
//
//    public static void getElements(int[] arr, int n) {
//        int largest = arr[0];
//        int second_largest = arr[0];
//        int smallest = arr[n - 1];
//        int second_smallest = arr[n - 1];
//
//        for (int i = 0; i < n; i++) {
//            smallest = Math.min(smallest, arr[i]);
//
//            largest = Math.max(largest, arr[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < second_smallest && arr[i] != smallest) {
//                second_smallest = arr[i];
//            }
//            if (arr[i] > second_largest && arr[i] != largest) {
//                second_largest = arr[i];
//            }
//        }
//        if (n <2 ) {
//            System.out.println("The second smallest number is : " + "-1");
//            System.out.println("The second largest number is : " + "-1");
//        } else {
//
//            System.out.println("The second smallest number is : " + second_smallest);
//            System.out.println("The second largest number is : " + second_largest);
//        }
//    }
//
//
//}

public class secondSmallestLargestArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);
        System.out.println("Second smallest is "+sS);
        System.out.println("Second largest is "+sL);

    }
    public static int secondLargest(int arr[],int n){
        if(n<2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]>sec_largest && arr[i] != largest){
                sec_largest = arr[i];
            }

        }
        return sec_largest;

    }
    public static int secondSmallest(int arr[],int n){
        if(n<2){
            return -1;
        }
//        int smallest = arr[n-1];
//        int sec_smallest = arr[n-1];

        int smallest = Integer.MAX_VALUE;;
        int sec_smallest = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i] < smallest){
                sec_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<sec_smallest && arr[i] != smallest){
                sec_smallest = arr[i];
            }

        }


        return sec_smallest;

    }

}

